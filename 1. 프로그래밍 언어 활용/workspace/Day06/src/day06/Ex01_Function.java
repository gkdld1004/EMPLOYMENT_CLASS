package day06;

import java.util.Scanner;

// 변수, 상수, 함수 -> 값으로 사용할 수 있는 형태

public class Ex01_Function {
	// 함수를 정의한다.
	// 반환자료형 함수이름 ( 매개변수 선언 ) {
	//		함수의 몸통 (body);
	//		수행할 코드를 작성한다.
	//		return [함수의 호출을 대체하는 하나의 값];
	//	}
	
	static int add(int n1, int n2) {	// 함수 사용 이유 : 코드의 재사용성 
		// This method must return a result of type int		// Method : 클래스 안에 있는 함수, 무조건 반환 ! 
		return n1 + n2;
	}
	
	public static void main(String[] args) {	// void : 반환하는 값은 따로 없음
		
		int num = add(10, 20);
		// 함수 호출 : 함수이름 (인자값1, 인자값2);
		
		System.out.println(num);
		System.out.println(add(11, 22));
		System.out.println(add(100, 55));
		System.out.println(add(1, 0));
		
		Scanner sc = new Scanner(System.in);
		int n2 = sc.nextInt();	// nextInt() 는 무조건 Int 하나는 가져다 준다.
		System.out.println(n2);
		sc.close();
		
		/*
		 * 	함수. 기능. Function
		 * 	: 어떤 작업을 수행하는 코드의 묶음 (이름을 만들어서 부르면 실행됨 )
		 * 	
		 * 	y = f(x)
		 * 
		 * 	함수 정의
		 * 	함수 호출
		 * 	함수 반환		  
		 * 
		 */
		
	}
}
