package LastTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("start.fxml"));
		Parent root = loader.load();	// view와 controller를 구성
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("성적 계산기");
		primaryStage.show();
		
		System.out.println("show 완료");
		
		
//		VBox box = (VBox)root;	// UI 최상위 root객체를 맞는 자료형으로 가져와서
//		for(Node node : box.getChildren()) {	// box내부의 각 요소를 node라고 할 때
//			if(node instanceof HBox) {
//				for(Node n2 : ((HBox)node).getChildren()) {
//					if(n2 instanceof TextField && n2.getId().equals("engField")) {
//						n2.requestFocus();
//					}
//				}
//			}
//		}
	}
}
