package quiz;

import java.util.Date;
// MyButton.java		클래스 파일
// EventFunction.java	인터페이스 파일

public class Main {
	public static void main(String[] args) {
		
		EventFunction e = () -> {
			System.out.println(new Date());
		};
		
		MyButton btn1 = new MyButton("버튼1");
		MyButton btn2 = new MyButton("버튼2", e);
		
		btn1.click();
		btn2.click();
	}
}
