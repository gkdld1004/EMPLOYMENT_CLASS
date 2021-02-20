package fx07;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	int i;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mainView.fxml"));
		Parent root = loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("이름과 나이를 입력");
		primaryStage.show();
		
		// FXML 로더 객체를 사용할 경우 fxml에 따른 컨트롤러 객체가 있어야 한다
		MainController mainCon = loader.getController();
		mainCon.nameField.setAlignment(Pos.CENTER);
		mainCon.ageField.setAlignment(Pos.CENTER);
		
		mainCon.quitBtn.setOnAction(event -> {			// 이벤트 
			
			Thread th = new Thread(() -> {				// 이벤트가 발생하면 수행할 Thread(Runnable)
				// Runnable의 public void run()
				
				for(i = 3; i >= 0; i--) {
					Platform.runLater(() -> {	// UI를 변경하는 내용만 Platform.runLater(Runnable)
						mainCon.quitBtn.setText(String.format("종료 (%02d)", i));
					}); 
					
					try { Thread.sleep(1000); } catch(InterruptedException e) {}
				}
				Platform.exit();
			});
			th.start();	// 이벤트가 발생하면 스레드를 실행할거다
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}