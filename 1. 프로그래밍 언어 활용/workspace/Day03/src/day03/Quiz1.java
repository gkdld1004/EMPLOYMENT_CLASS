package day03;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		// 문제. 한 글자를 입력받아서 글자가 산술연산자(+, -, *, /, %)인지 아닌지 팔별하는 코드
		
		Scanner sc = new Scanner(System.in);
		char input;	
		
		// char == '', String.eqauls("")
		
		// 결과 : 연산자입니다. / 연산자가 아닙니다.

		System.out.print("한 글자를 입력 : ");
		input = sc.next().charAt(0); // 0번째 index에 있는 글자만 입력받는다.
		// 문자열'의' 0번째 글자를 input에 담아라.

		switch (input) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '%':
			System.out.println("연산자입니다.");
			break;
		default:
			System.out.println("연산자가 아닙니다.");
		}

		sc.close();
		
//		풀이 1. 전부 다 따로 
		
//		boolean flag1 = input == '+';
//		boolean flag2 = input == '-';
//		boolean flag3 = input == '*';
//		boolean flag4 = input == '/';
//		boolean flag5 = input == '%';
//		boolean result = flag1 || flag2 || flag3 || flag4 || flag5;
//		
//		if(result) {
//			System.out.println(input + " : 연산자입니다.");
//		}else {
//			System.out.println(input + " : 연산자가 아닙니다.");
//		}


	}
}
