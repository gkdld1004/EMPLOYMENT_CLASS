package fx09;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableView_Main extends Application {

	Controller con;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
		Parent root = loader.load();		// view를 자바 객체화해서 불러오고, view에 연결된 컨트롤러도 생성한다.
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("테이블 뷰");
		primaryStage.show();
		
		con = loader.getController();
		
		// Model : 화면에 나타나야 하는 데이터(객체)의 실제 내용을 관리하는 클래스
		// View : 사용자에게 보여지는 화면을 나타내거나, 사용자의 작동을 Controller에게 전달
		// Controller : Model의 정보를 View에 반영하거나, View의 요청을 Model에 반영한다
	}
	
	@Override
	public void stop() throws IOException {
		con.model.save();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
