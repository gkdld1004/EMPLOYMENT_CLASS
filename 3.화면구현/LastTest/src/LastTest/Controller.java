package LastTest;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller  {
	
	@FXML TextField korField, engField, mathField;
	@FXML Text msg, resultText;
	@FXML Button resultBtn, quitBtn, backBtn;
	
	@FXML private void result() {
		Stage primaryStage = (Stage)quitBtn.getScene().getWindow();

		boolean kor_null = korField.getText().equals("");
		boolean eng_null = engField.getText().equals("");
		boolean math_null = mathField.getText().equals("");
		
		if(kor_null || eng_null || math_null) 
			msg.setText("모든 값을 빠짐없이 입력해주세요");
		
		else {
			int sum = 0;
			try {
				sum += Integer.parseInt(korField.getText());
				sum += Integer.parseInt(engField.getText());
				sum += Integer.parseInt(mathField.getText());
			} catch(NumberFormatException ex) {
				msg.setText("점수는 정수형으로 입력해주세요");
				return;
			}
			double avg = sum / 3.0;
			String rank = "F";
			
			switch((int)avg / 10) {
				case 10: 	rank = "A+";	break;
				case 9: 	rank = "A";		break;
				case 8: 	rank = "B";		break;
				case 7: 	rank = "C";		break;
				case 6: 	rank = "D";		break;
			}
			
			String result = "";
			result += String.format("합계는 %d 점입니다\n\n", sum);
			result += String.format("평균은 %.2f 점입니다\n\n", avg);
			result += String.format("평점은 %s 입니다", rank);
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("result.fxml"));
			Parent root;
			try {
				root = loader.load();
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
				
				Controller rescon = loader.getController();
				rescon.resultText.setText(result);
				
			} catch (IOException e) {}
		}
	}
	
	@FXML private void quit(ActionEvent e) {
//		Stage now = (Stage)quitBtn.getScene().getWindow();
//		now.close();
		
//		System.exit(0);
		
		Platform.exit();
	}
	
	@FXML private void back(ActionEvent e) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("start.fxml"));
		Parent root = loader.load();
		
		Stage primaryStage = (Stage)quitBtn.getScene().getWindow();
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	@FXML private void key(KeyEvent e) {	// 국어, 영어, 수학 필드에 적용
		
		switch(e.getCode().toString()) {
		case "ESCAPE" :
			((TextField)e.getSource()).setText("");
			break;
			
		case "ENTER" : 	
			result();	// 원래 result는 resultBtn에 onAction으로 걸린 이벤트 핸들러 함수이지만
			break;		// 만들어진 메서드를 임의로 호출해서 사용할 수도 있다
		}
	}

}