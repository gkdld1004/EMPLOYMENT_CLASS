package day19_ex01;

public class Main {
	public static void main(String[] args) {
		
		Timer t = new Timer(10);		// Thread 클래스다 ? 다중 동시작업 ~
		Input input = new Input(t);		// Input이 Timer를 참조 ~
		
//		t.go();
		t.start();		// run()을 시작~
		input.go();
	}
}
