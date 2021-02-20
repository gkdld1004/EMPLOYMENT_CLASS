package day03;

import java.util.Scanner;

public class Quiz2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 문제. 두 정수와 부호를 입력받아 답을 출력하는 코드를 작성하세요.
		// +, -, *, /, % (나눗셈은 정수범위에서만)
		
//		// 작업을 어떻게 처리할 것인가 ? (생각 정리를 잘하는게 중요!!)
//		// 1) 두 정수와 글자, 결과를 저장할 정수 변수 공간을 준비한다.
//		int n1, n2, result = 0;
//		char oper;
//		// 2) 입력을 받을 수 있는 Scanner를 준비한다.
//		Scanner sc = new Scanner(System.in);
//		// 3) 1번째 정수 입력을 위한 안내 메시지를 출력한다.
//		System.out.print("정수 1 입력 : ");
//		// 4) 스캐너로 정수를 입력받는다.
//		n1 = sc.nextInt();
//		// 5) 2번째 정수 입력을 위한 안내 메시지를 출력한다.
//		System.out.print("정수 2 입력 : ");
//		// 6) 스캐너로 정수를 입력받는다.
//		n2 = sc.nextInt();
//		// 7) 연산자 입력을 위한 안내 메시지를 출력한다.
//		System.out.println("연산자 입력 : ");
//		// 8) 스캐너로 연산자를 입력받는다.
//		oper = sc.next().charAt(0);
//		// 8-1) 만약, 연산자가 5개 중에 해당하지 않는다면 에러를 출력하고 실행을 종료한다.
//		boolean checkOper = oper == '+';
//		checkOper = checkOper || oper == '-';
//		checkOper = checkOper || oper == '*';
//		checkOper = checkOper || oper == '/';
//		checkOper = checkOper || oper == '%';
//		if(checkOper == false) {		// 만약 연산자가 5개 중 하나도 해당하지 않다면
//			System.err.println("연산자가 올바르지 않습니다.");
//			return;		// 함수를 즉시 종료한다.
//		}
//		// 9) 모든 값이 정상적으로 입력되었다면 연산자의 종류를 판별한다.
//		// 10) 연산자에 따라서 첫번째 정수와 두번째 정수를 연산한 값을 결과 변수에 담는다.
//		if(oper == '+')		result = n1 + n2 ;
//		else if(oper == '-')		result = n1 - n2 ;
//		else if(oper == '*')		result = n1 * n2 ;
//		else if(oper == '/')		result = n1 / n2 ;
//		else if(oper == '%')		result = n1 % n2 ;
//		else						result = 0;
//		// 분기문을 사용할 때는, 모든 나머지 가능성에 대해서 처리하는 else를 사용하는게 좋다.		
//		// 11) 입력받은 값들을 활용하여 결과를 출력한다.
//		System.out.printf("%d %c %d = %d\n", n1, oper, n2, result);
//		// 12) 사용이 끝난 Scanner를 close() 한다.
//		sc.close();
//		// 13) 종료
//		return;
		
		// 자바에서는 정수를 논리값으로 사용할 수 없다 !! 
		// if(1) != if(true)
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연산 입력 : ");
		char sign = sc.next().charAt(0);
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		switch(sign) {	// if-else에서 하나의 특정 변수의 값 만으로 분기가 이루어진다면 switch문으로 바꾸어 쓸 수 있다.
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:		// if문에서의 else와 유사한 역할을 한다.
			System.out.println("잘못된 입력 !!");
			return;	// return : 함수 종료
		}
		
		System.out.println("입력한 연산 결과는 " + result + "입니다.");
		
		sc.close();
	}

}
