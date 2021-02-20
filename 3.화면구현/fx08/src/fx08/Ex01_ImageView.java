package fx08;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01_ImageView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// http://221.164.9.222/img/dora.png
		
		Image image = new Image("http://221.164.9.222/img/dora.png");
		Image image2 = new Image(getClass().getResource("danbi.jpg").toString());
		
		ImageView iv = new ImageView(image);
		
		Button btn1 = new Button("진구야");
		Button btn2 = new Button("단비꺼야");
		
		btn1.setOnAction(event -> { iv.setImage(image); });
		btn2.setOnAction(event -> { iv.setImage(image2); });
		
		HBox hb1 = new HBox(btn1, btn2);
		hb1.setAlignment(Pos.CENTER);
		hb1.setPrefHeight(100);
		
		HBox hb2 = new HBox(iv);			
		hb2.setPrefSize(300, 300);
		hb2.setAlignment(Pos.CENTER);
		
		VBox vb1 = new VBox(hb2, hb1);		// root
		vb1.setAlignment(Pos.CENTER);
		vb1.setPrefSize(500, 500);
		
		primaryStage.setScene(new Scene(vb1));
		primaryStage.setTitle("ImageView");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
