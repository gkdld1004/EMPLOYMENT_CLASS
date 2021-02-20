package day10;

class Test3 {	// 설계도
	// 변수나 함수를 [선언]하는 공간 (연산, 호출하면 안됨)
	int n1 = 10, n2 = 20;
	int result;
	
//	안되는 예시 
//	if(n1 == 10)
//		System.out.println("10이다 ~");
//	result = n1 + n2;
	
	int add(int n1, int n2) {		// 메서드 내부에서 코드의 진행을 작성한다.
		return n1 + n2;
	}
	
	// 메서드는 오버로딩이 가능하다.
	double add(double n1, double n2) {		// 매개변수로 구분
		return n1 + n2;
	}
	
}

public class Ex03_Method {
	public static void main(String[] args) {

//		자료형 변수이름 = new 자료형();
		Test3 calc = new Test3();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(1.2, 2.3));
	}
}
