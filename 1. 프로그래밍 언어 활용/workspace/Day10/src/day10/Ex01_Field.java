package day10;

class Test1 {
	String str;
	int num;
	
	Test2 ob2 = new Test2();		// 멤버 필드가 객체를 가리키는 상태
	Test2 ob3;						// 멤버 필드는 존재하지만 대상이 없어서 null인 상태
}

class Test2 {
	String name = "test2";		// 멤버 필드는 직접 초기화가 가능하다. (!= 구조체)
}

public class Ex01_Field {
	public static void main(String[] args) {
		
		Test1 ob1 = new Test1();
		
		System.out.println(ob1.str);		// 참조변수는 멤버필드일 때 초기값 null
		System.out.println(ob1.num);		// 원시자료형은 멤버필드일 때 초기값이 0
		
		String str = null;		// 초기화되지 않은 지역변수는 출력할 수 없다.
		int num = 0;			// 지역변수는 자료형에 맞게 초기화를 직접 진행하는 것이 좋다.
		System.out.println(str);		
		System.out.println(num);
		
		// .연산자 기준 왼쪽의 값이 null이면 java.lang.NullPointerException (참조대상이 없다.)
		
		System.out.println(ob1 + ", " + ob1.ob2);
		System.out.println(ob1.ob2.name + "\n");
		
		System.out.println(ob1 + ", " + ob1.ob3);
		System.out.println(ob1.ob3.name + "\n");
	}
	
}
