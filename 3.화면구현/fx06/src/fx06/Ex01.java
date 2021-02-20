package fx06;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseButton;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("alert");
		Button btn2 = new Button("confirm");
		Button btn3 = new Button("test");
		
		HBox hb1 = new HBox(btn1, btn2, btn3);
		hb1.setAlignment(Pos.CENTER);
		hb1.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(hb1));
		primaryStage.setTitle("팝업");
		primaryStage.show();
		
		// 버튼에 이벤트를 추가하는 코드
		// btn1 : 이벤트 소스, 이벤트가 발생하는 화면 요소
		// onAction : 리스너, 이벤트가 발생하는지 감지하는 객체
		// new EventHandler() 내부의 public void handle() : 핸들러, 이벤트를 처리하는 객체
		
		// 추상클래스를 이용하여 익명클래스 형식으로 이벤트 핸들러를 만들었다
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setTitle("정보");
				alert1.setHeaderText("헤더 텍스트");
				alert1.setContentText("여기에 내용을 입력합니다");
				alert1.show();
			}
		});
		
		// 함수형 인터페이스를 활용하여 람다식으로 객체를 생성했다	(매개변수) -> {메서드 처리 내용}  // 람다식 인터페이스 객체 생성
		btn2.setOnAction((event) -> {
			Alert alert2 = new Alert(AlertType.CONFIRMATION);
			alert2.setTitle("확인/취소");
			alert2.setHeaderText("헤더 텍스트");
			alert2.setContentText("둘 중 하나를 선택하세요");
			
			Optional<ButtonType> result = alert2.showAndWait();
			
			if(result.get() == ButtonType.OK) {
				System.out.println("OK를 눌렀음");
			}
			else {
				System.out.println("취소를 눌렀음");
			}
		});
		
		// 소스에 리스너가 감지하는 유형의 이벤트가 발생하면, 핸들러를 실행해라
		btn3.setOnMouseClicked( (event) -> {
			if(event.getButton() == MouseButton.PRIMARY) {
				System.out.println("왼쪽 버튼을 클릭 !!");
			}
			else if(event.getButton() == MouseButton.SECONDARY) {
				System.out.println("오른쪽 버튼을 클릭 !!");
			}
		} );
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
