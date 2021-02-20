package day15;

class Test1 {
	
}

class Test2 {
	@Override		// 물려받은 메소드를 새롭게 정의 
	public String toString() {
		return "객체 출력의 형태를 내가 새롭게 정의함 : Test2";
	}
	
//	@Override
//	public Class getClass() {
//		// Cannot override the final method from Object
//	}
}

public class Ex03_ObjectOverriding {
	public static void main(String[] args) {
		
		Test1 ob1 = new Test1();
		Test2 ob2 = new Test2();
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}
}
