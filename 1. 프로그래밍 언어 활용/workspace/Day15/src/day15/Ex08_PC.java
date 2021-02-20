package day15;

interface USB {
	String version = "USB 3.1";		// public static final
	
	void action();		// public abstract
	// 형식만 정의하고 아래에서 강제 구현
}

class Fan implements USB {
	@Override 
	public void action() {
		System.out.println(USB.version);
		System.out.println("USB에 연결되어 전원을 공급받습니다.");
		System.out.println();
	}
}

class MemoryStick implements USB {

	@Override
	public void action() {
		System.out.println(USB.version);
		System.out.println("컴퓨터와 파일을 주고 받습니다. 용량 16GB");
		System.out.println();
		
	}
	
}

class Cable implements USB {

	@Override
	public void action() {
		System.out.println(USB.version);
		System.out.println("스마트폰과 연결되어서 충전 및 데이터 전송이 가능합니다.");
		System.out.println();
		
	}
	
}

class PC {
	void connect(USB ob) {
		ob.action();
	}
}

public class Ex08_PC {
	public static void main(String[] args) {
		
		Cable ob1 = new Cable();
		Fan ob2 = new Fan();
		MemoryStick ob3 = new MemoryStick();
		
		PC pc = new PC();
		
//		USB ref = ob1;		// 대입을 통한 업캐스팅
		
		pc.connect(ob1);
		pc.connect(ob2);
		pc.connect(ob3);
		
		// 인터페이스는 추상클래스이므로, 익명 클래스를 통한 객체 생성이 가능하다.
		USB ob4 = new USB() {		// 추상클래스의 특징을 활용한 익명클래스를 통한 객체 생성 방식 
			@Override
			public void action() {
				System.out.println(USB.version);
				System.out.println("키보드 입력 대기중...");
				System.out.println();
			}
		};
		
		pc.connect(ob4);
		
		// 인터페이스를 람다식으로 객체 생성하기 (익명클래스가 아님에 주의 !! java 1.8부터 지원 !)
		// 람다식을 활용하기 위해서는, 인터페이스에 메서드가 하나만 있어야 한다.
		USB mouse = () -> {	
			//	그 함수가 가지는 값이 밑에 것들?
			System.out.println(USB.version);
			System.out.println("마우스 입력 대기중...");
			System.out.println();
		};
		
		pc.connect(mouse);
	}
}
