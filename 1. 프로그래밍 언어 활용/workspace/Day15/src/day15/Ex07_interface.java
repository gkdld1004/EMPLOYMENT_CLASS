package day15;

interface Test3 {	// interface : 구격?
	// interface 는 추상클래스의 한 종류이다.
	// interface 는 extends 대신 implement 키워드로 상속(구현)한다.
	// interface 의 모든 필드는 static final 속성을 가진다.
	// interface 는 다중 상속이 가능하다 !!
	String name = "인터페이스";
	void test();
}

class Test4 extends Object implements Test3 {
	
	@Override		// 재정의 할 때 원형보다 접근제한의 범위를 줄일 수 없다.
	public void test() {
		System.out.println();
	}
	
}

public class Ex07_interface {
	public static void main(String[] args) {
		System.out.println(Test3.name);
	}
}
