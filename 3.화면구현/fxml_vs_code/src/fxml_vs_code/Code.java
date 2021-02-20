package fxml_vs_code;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Code extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text idText = new Text("ID");
		Text pwText = new Text("Password");
		TextField idField = new TextField();
		PasswordField pwField = new PasswordField();
		
		idText.setWrappingWidth(100);
		pwText.setWrappingWidth(100);
		
		Button btn1 = new Button("로그인"); 
		
		HBox hb1 = new HBox(idText, idField);
		HBox hb2 = new HBox(pwText, pwField);
		HBox hb3 = new HBox(btn1);
		
		hb1.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);
		hb3.setAlignment(Pos.CENTER);
		
		hb1.setPrefHeight(50);
		hb2.setPrefHeight(50);
		hb3.setPrefHeight(50);
		
		VBox root = new VBox(hb1, hb2, hb3);
		root.setAlignment(Pos.CENTER);
		root.setPrefSize(500, 300);
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("테스트1 - 코드로 작성한 화면");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}