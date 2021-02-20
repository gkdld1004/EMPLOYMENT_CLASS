package fx06;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn1 = new Button("버튼");
		HBox hb1 = new HBox(btn1);
		hb1.setPrefSize(300, 200);
		hb1.setAlignment(Pos.CENTER);
		
		primaryStage.setScene(new Scene(hb1));
		primaryStage.setTitle("새 창 열기");
		primaryStage.show();
		
		Stage newStage = new Stage();		// 새로운 창을 열기 위해서는 Stage객체를 새로 생성한다
		Text text = new Text("새 창입니다");
		HBox hb2 = new HBox(text);
		hb2.setAlignment(Pos.CENTER);
		hb2.setPrefSize(200, 150);
		newStage.setScene(new Scene(hb2));
		newStage.setTitle("새 창");
		
		btn1.setOnAction(event -> {	// btn1에서 액션이벤트가 발생하면 newStage의 show()를 호출한다
			newStage.show();
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
