package day11;

class Human {
	private String name;
	private int age;		// private 내부에서만 접근 가능 (외부, 메인함수에서는 직접 접근이 불가능)
	
	public Human(String name, int age){		// public 누구나 접근가능 
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "님은 " + age + "살입니다.");
	}
}

public class Ex01_AccessModifier {
	public static void main(String[] args) {
		
		// 접근 제한자 : 객체 내부의 멤버 요소에 대한 외부로부터의 접근을 제어할 수 있다.
		
		// private		: 내부에서만 접근 가능
		// protected	: 상속관계에서 접근 가능
		// package		: 상속관계 및 같은 패키지 폴더 내의 다른 클래스가 접근 가능 (기본값)
		// public		: 누구나 접근 가능
		
		Human h1 = new Human("이지은", 28);
		//h1.age += 10;		// The field Human.age is not visible 외부에서는 확인 불가능 
		h1.show();
		
	}
}
