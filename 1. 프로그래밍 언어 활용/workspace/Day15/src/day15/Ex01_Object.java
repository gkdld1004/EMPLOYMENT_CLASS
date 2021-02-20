package day15;

// 전제) 자바는 다중상속을 허용하지 않는다. 슈퍼클래스는 하나만 존재한다.
// 비어있는 클래스로 객체를 생성해도 어떤 메서드들이 준비되어 있다.

class Super /* extends Object */{
	
}

class Sub extends Super {
	
}

public class Ex01_Object {
	public static void main(String[] args) {
		Super ob1 = new Super();
		Sub ob2 = new Sub();
		
		ob1.getClass();
		ob2.getClass();
	}
}
