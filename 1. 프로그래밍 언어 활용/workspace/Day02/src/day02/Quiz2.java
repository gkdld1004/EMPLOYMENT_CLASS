package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

		// 1. Scanner 를 이용하여 입력받으세요.
		// 이름과 나이를 입력받고 나이가 20살 미만이면 미성년자, 20살 이상이면 성인을 출력하세요.
		// if ~ else를 이용하여 출력해보고, 삼항연산자를 활용하여 출력해보세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.printf("%s님은 ", name);
		
		if (age < 20) {
			System.out.print("미성년자");		// if 문장이 끝나지 않았을 때 한줄이면 중괄호 생략가능
			// adult = "미성년자";
		} else {
			System.out.print("성인");
			// adult = "성인";
		}
		System.out.print(" 입니다.");
		// System.out.print(adult);
		System.out.print("\n 삼항연산자를 이용해도 ");	// * 삼항연산자 : 조건 ? 참 : 거짓
		System.out.println(age < 20 ? "미성년자" : "성인");
		// adult = age >= 20 ? "성인" : "미성년자";	

		// 2. 사용자에게 주민등록번호 뒷자리 첫번째(성별) 숫자를 입력받아서
		// 1이면 1900년대 남성
		// 2이면 1900년대 여성
		// 3이면 2000년대 남성
		// 4이면 2000년대 여성
		// 을 출력하는 코드를 switch ~ case 를 활용하여 작성하세요.

		System.out.println();

		System.out.print("주민번호 뒷자리 첫번째 숫자 입력 : ");
		int num = sc.nextInt();

		switch (num) {		// 자바의 switch에는 String을 넣을 수 있다.
		case 1:
			System.out.println("1990년대 남성");
			break;
		case 2:
			System.out.println("1990년대 여성");
			break;
		case 3:
			System.out.println("2000년대 남성");
			break;
		case 4:
			System.out.println("2000년대 여성");
			break;
		default:		// default 는 break 필요 없음
			System.out.println("잘못된 입력입니다.");
		}
		
		// case 1: case 2:
		//	System.out.println(); break;	묶어서 처리도 가능
		
		sc.close();
		
		// Ctrl + shift + F : 자동정렬 
		
	}
}
