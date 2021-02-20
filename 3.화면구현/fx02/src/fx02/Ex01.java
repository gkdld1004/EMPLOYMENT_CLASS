package fx02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text("Hello, javaFX !!\n");	// text를 만든다
		text.setFont(new Font(30));					// text의 글자 크기는 30pt
		
		Button btn = new Button("확인"); 
		btn.setFont(new Font(16));
		
		HBox box = new HBox(text, btn);				// text를 포함하는 VBOX를 만든다
		box.setPrefSize(200, 150);
		box.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(box, 300, 200);		// VBOX를 이용하여 장면 하나를 만든다
		
		primaryStage.setScene(scene);				// 만든 장면을 무대에 올린다
		primaryStage.setTitle("제목 표시줄 이름");		// 무대의 제목을 정한다
		primaryStage.show();						// 무대 시작
	}
	
	public static void main(String[] args) {
		launch(args); 	// 초기화 이후 start()가 호출된다
	}

}