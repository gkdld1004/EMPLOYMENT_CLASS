package fx07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	@FXML TextField nameField, ageField;
	@FXML Button resultBtn, quitBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Main 컨트롤러 초기화");
		
		// 컨트롤러에서 fx:id를 이용하여 버튼 객체를 참조하고, 버튼에 이벤트를 부여한다
		quitBtn.setOnAction(event -> {
			Platform.exit();
		});

		// resultBtn에 연결해줄 이벤트 핸들러를 먼저 작성 (함수 실행이 아니라, 선언만 한다)
		EventHandler<ActionEvent> resultHandler = (event) -> {
			
			Stage popupStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("popupView.fxml"));
			Parent root;
			try {
				root = loader.load();
				popupStage.setScene(new Scene(root));
				popupStage.setTitle("새 창");
				popupStage.show();
				
				PopUpController popupCon = loader.getController();
				int age = Integer.parseInt(ageField.getText());
				String value = String.format("%s님은 %d살이고, %s입니다", 
						nameField.getText(), 
						age,
						age >= 20 ? "성인" : "미성년자");
				popupCon.resultText.setText(value);
				
			} catch (IOException e) {}
		};
		
		resultBtn.setOnAction(resultHandler);	// 소스.리스너(핸들러)
	}
}
