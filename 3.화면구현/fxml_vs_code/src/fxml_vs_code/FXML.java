package fxml_vs_code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
		Parent root = loader.load();
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("테스트1 - SceneBuilder로 작성한 화면");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
