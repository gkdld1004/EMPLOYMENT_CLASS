package fx10;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Controller implements Initializable {

	@FXML TableView<MemberVO> table;
	@FXML TableColumn<MemberVO, ImageView> photoColumn;
	@FXML TableColumn<MemberVO, String> nameColumn;
	@FXML TableColumn<MemberVO, String> pnumColumn;
	
	@FXML TextField nameField, pnumField;
	@FXML Button addBtn, deleteBtn, quitBtn;
	
	Model model = new Model();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 테이블의 각 컬럼에 자료형을 지정한다
		photoColumn.setCellValueFactory(new PropertyValueFactory<MemberVO, ImageView>("image"));
		// MemberVO자료형의 내부 멤버 필드 ImageView 자료형의 image 필드를 찾아서, 해당 속성을 테이블의 photoColumn에 띄운다
		
		photoColumn.setPrefWidth(60);
		
		nameColumn.setCellValueFactory(cellData->cellData.getValue().getName());
		pnumColumn.setCellValueFactory(cellData->cellData.getValue().getPnum());
		
		// CSS
		photoColumn.setStyle("-fx-alignment: center");
		nameColumn.setStyle("-fx-alignment: center");
		pnumColumn.setStyle("-fx-alignment: center");
		
		table.setStyle("-fx-font-size: 14pt");
		
		// model에 저장된 리스트의 아이템들을 테이블에 세팅한다
		table.setItems(model.list);
		
		// 추가 버튼 이벤트 함수
		addBtn.setOnAction(e -> {
			String name = nameField.getText();
			String pnum = pnumField.getText();
			
			if("".equals(name) || "".equals(pnum)) {	// 이름이나 전화번호가 비어있으면
				return;		// 더이상 진행하지 않는다 (추가하지 않는다)
			}
			
			MemberVO newData = new MemberVO(name, pnum);
//			model.list.add(newData);
			model.addMember(newData);
			
			nameField.clear();
			pnumField.clear();
		});
		
		// 삭제 버튼 이벤트 함수
		deleteBtn.setOnAction(e -> {
			int index = table.getSelectionModel().getFocusedIndex();	// 0부터 시작
			System.out.println("index : " + index);
			
			String contentText = "<%s> 전화번호를 삭제합니다\n계속하려면 [OK]를 클릭하세요";
			String name = model.list.get(index).getName().get();
			contentText = String.format(contentText, name);
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("=== 전화번호 삭제 ===");
			alert.setHeaderText("선택한 전화번호를 삭제합니다");
			alert.setContentText(contentText);
			
			Optional<ButtonType> result = alert.showAndWait();
			
			if(result.get() == ButtonType.OK) {
				model.deleteMember(index);
				nameField.clear();
				pnumField.clear();
			}
		});
		
		// 종료 버튼 이벤트 함수
		quitBtn.setOnAction( e -> Platform.exit() );
		
		// 테이블의 특정 항목을 클릭하면 클릭된 객체의 정보를 아래쪽 필드에 자동으로 완성하는 이벤트 함수
		table.setOnMouseClicked(mouseEvent -> {
			int index = table.getSelectionModel().getFocusedIndex();
			if(index == -1) return;
			System.out.println(index);
			MemberVO selected = model.list.get(index);
			String name = selected.getName().get();
			String pnum = selected.getPnum().get();
			nameField.setText(name);
			pnumField.setText(pnum);
		});
		
		
		// 테이블에서 ESC키를 누르면, 필드의 값을 제거하는 이벤트 함수
		table.setOnKeyPressed(keyEvent -> {
			if(keyEvent.getCode() == KeyCode.ESCAPE) {
				nameField.clear();
				pnumField.clear();
			}
		});
	}
}
