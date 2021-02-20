package fx04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
	@FXML TextField nameField;	// form.fxml을 불러왔을 때 참조할 수 있는 필드
	@FXML TextField ageField;	// form.fxml을 불러왔을 때 참조할 수 있는 필드
	@FXML Text result;			// result.fxml을 불러왔을 때 참조할 수 있는 필드
	
	private boolean isNumeric(String value) {
		// String은 연속된 char로 구성되어 있다
		for(int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			if(ch < '0' || '9' < ch) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkField() {
		// 1. 문자열이 모두 숫자형태로 구성되어 있는지 확인해서 boolean을 반환하는 메서드를 작성해서 호출
//		if(isNumeric(ageField.getText()) == false) {	// 나이 필드의 값이 전부 숫자로 구성되어 있는지 확인해서 아니면 return false;
//			System.out.println("나이 필드가 정수로 구성되지 않았음 !!");
//			ageField.requestFocus();
//			return false;
//		}
		
		// 2. 문자열을 숫자로 변환하는 메서드를 호출해서 예외가 발생하면 return false하도록 처리
		try {
			Integer.parseInt(ageField.getText());
			
		} catch(NumberFormatException e) {
			System.out.println("나이 필드가 정수로 구성되지 않았음 !!");
			ageField.requestFocus();
			return false;
		}
		
		// 1) 모든 값이 입력되었는지
		if("".equals(nameField.getText())) {	// 이름이 비어 있으면
			System.out.println("이름 필드가 입력되지 않음 !!");
			nameField.requestFocus();	// 지정한 필드에 커서가 위치하도록 포커스를 준다
			return false;
		}
		else if("".equals(ageField.getText())) {// 나이가 비어 있으면
			System.out.println("나이 필드가 입력되지 않음 !!");
			ageField.requestFocus();	// 지정한 필드에 커서가 위치하도록 포커스를 준다
			return false;
		}
		
		return true;
	}
	

	@FXML private void back() throws Exception {
		
		Stage primaryStage = (Stage)result.getScene().getWindow();
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("form.fxml")));
		primaryStage.setScene(scene);
		primaryStage.setTitle("이름과 나이 입력하기");
		primaryStage.show();
	}
	
	@FXML private void result() throws Exception {
		
		if(checkField() == false) {
			return;	// 현재 진행중인 메서드의 즉각적인 종료
		}

		Stage primaryStage = (Stage)nameField.getScene().getWindow();
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("result.fxml")));
		primaryStage.setScene(scene);
		primaryStage.setTitle("결과 출력");
		primaryStage.show();
		
		// 장면이 바뀌면 컨트롤러의 객체가 변경되기 때문에 바꾸고 나서 메시지를 미리 주입한다
		VBox root = (VBox)scene.getRoot();
		HBox box1 = (HBox)root.getChildren().get(1);
		Text msg = (Text)box1.getChildren().get(0);
		System.out.println(msg);
		msg.setText(String.format("%s님은 %s살입니다", nameField.getText(), ageField.getText()));
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 컨트롤러를 초기화 하면서 사용하고 싶은 장면을 미리 불러놓으면 다른 메서드에서는 참조만 하면 된다
		String[] arr = location.getFile().split("/");
		String fxml = arr[arr.length - 1];
		System.out.println("컨트롤러 초기화 완료 !! : " + fxml);
		System.out.println(this);
		
		if(fxml.equals("result.fxml")) {
//			String msg = "여기에 결과를 넣어주면 됩니다";
//			result.fxml 에서는 fx:id="nameField" 가 없다 (ageField도 없다)
//			msg = String.format("%s님은 %d살입니다", nameField.getText(), ageField.getText());
//			result.setText(msg);
		}
	}

}