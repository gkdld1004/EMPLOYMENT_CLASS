package fx06;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Quiz1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 프로그램 디자인으로 화면을 구현하세요
		// primaryStage에서는 이름과 나이를 입력받는 텍스트 필드가 있어야 합니다
		// 새로운 창에서는 입력받은 나이를 화면에 출력하면서 성인/미성년자 판별여부를 텍스트로 출력합니다
		// 새 창만 닫는 버튼을 만드려면 이벤트 핸들러에서 newStage.close() 를 호출하면 됩니다
		// 프로그램 전체를 닫으려면 System.exit(0) 혹은 Platform.exit() 를 호출하면 됩니다
		
		Text t1 = new Text("이름\t");
		Text t2 = new Text("나이\t");
		TextField f1 = new TextField();
		TextField f2 = new TextField();	
		
		HBox hb1 = new HBox(t1, f1);
		hb1.setAlignment(Pos.CENTER);
		hb1.setPrefSize(200, 70);
		
		HBox hb2 = new HBox(t2, f2);
		hb2.setAlignment(Pos.CENTER);
		hb2.setPrefSize(200, 70);
		
		Button btn1 = new Button("확인");
		HBox hb3 = new HBox(btn1);
		hb3.setAlignment(Pos.CENTER);
		hb3.setPrefSize(200, 70);
		
		VBox vb1 = new VBox(hb1, hb2, hb3);
		vb1.setAlignment(Pos.CENTER);
		vb1.setPrefSize(500, 300);
		
		primaryStage.setScene(new Scene(vb1));
		primaryStage.setTitle("성인 여부 판별");
		primaryStage.show();
		
		Stage newStage = new Stage();
		btn1.setOnAction(event -> {
			int age;
			age = Integer.parseInt(f2.getText());
			String text = String.format("%s님은 %d살이고 %s입니다", 
					f1.getText(), age, age >= 20 ? "성인" : "미성년자");
			
			Text result = new Text(text);
			result.setFont(new Font(20));
			VBox vb2 = new VBox(result);
			vb2.setAlignment(Pos.CENTER);
			vb2.setPrefSize(400, 100);
			
			newStage.setScene(new Scene(vb2));
			newStage.setTitle("결과");
			newStage.show();
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}