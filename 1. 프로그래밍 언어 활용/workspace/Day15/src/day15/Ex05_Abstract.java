package day15;

abstract class Love {
	// 그 자체로는 객체를 생성할 수 없으나, 속성과 기능을 명시해두고 
	// 다른 클래스가 추상클래스를 상속받아서, 객체를 생성할 수 있다.
	
	// Abstract methods do not specify a body
	abstract void func();
}

class Present extends Love {
//	abstract void func2();
	
	@Override
	void func() {
		// 상속받은 메서드를 재정의(반환형, 이름, 매개변수가 일치)하면서 몸체를 구현하면 된다.
		System.out.println("옛다 내 하트를 받아라");
	}
}

public class Ex05_Abstract {
	public static void main(String[] args) {
		
		// 추상클래스 : 객체화 할 수 없는 형태를 클래스로 표현한 것 (추상메서드를 포함할 수 있는 클래스)
		// 추상메서드 : 메서드의 형태는 존재하지만, 내용이 없어서 호출할 수 없는 메서드
		
		// 1) 추상클래스는 객체를 생성할 수 없다.
//		Love object1 = new Love();
//		Cannot instantiate the type Love
		Present ob1 = new Present();
		ob1.func();
		
	}
}
