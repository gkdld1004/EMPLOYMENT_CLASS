package quiz;

public class MyButton {

	String name;
	EventFunction eventFunction;
	
	public MyButton(String name) {
		this.name = name;
	}

	public MyButton(String name, EventFunction e) {
		this.name = name;
		eventFunction = e;
	}
	
	public void click() {
		System.out.print(name + " : ");
		if(eventFunction != null) {
			eventFunction.handler();	// 함수를 전달하기 위한 형식 ?
		}
		else {
			System.out.println("이벤트 없음");
		}
	}

}
