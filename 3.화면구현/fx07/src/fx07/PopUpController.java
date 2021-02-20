package fx07;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PopUpController implements Initializable {
	@FXML Text resultText;	// 값을 넣어주기 (MainController에서 처리하고 있음)
	@FXML Button closeBtn;	// 이벤트를 넣어주기
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		closeBtn.setOnAction(event -> {
			Stage now = (Stage)closeBtn.getScene().getWindow();
			now.close();
		});
	}
}
