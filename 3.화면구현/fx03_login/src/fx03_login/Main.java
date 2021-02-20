package fx03_login;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		URL fxml = getClass().getResource("view.fxml");
		Parent root = FXMLLoader.load(fxml);
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("로그인 테스트");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
