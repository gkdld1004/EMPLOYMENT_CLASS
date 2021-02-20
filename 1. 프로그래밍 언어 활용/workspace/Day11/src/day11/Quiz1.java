package day11;

import java.util.Scanner;

public class Quiz1 {
	
	static boolean isNumeric(String str) {				// boolean : 참, 거짓을 판별
		for(int i = 0; i < str.length(); i++) {			// 문자열 전체에
			char ch = str.charAt(i);					// 각 글자가 ch라면 
			boolean flag = '0' <= ch && ch <= '9';		// ch가 0 ~ 9 사이가 정상일 조건 
			if(flag == false) {							// 조건이 하나라도 벗어나면
				return false;							// false를 반환하면서 함수 종료
			}
		}
		return true;									// 전체를 순회해도 조건을 벗어나는 경우가 없으면 true를 반환하면서 종료
	}
	
	public static void main(String[] args) {
		
		// 정수를 입력받아서 switch ~ case 메뉴를 구성하고 있습니다.
		// 만약 문자열을 입력하면 예외가 발생하여 프로그램이 실행되지 않는데
		// 이걸 해결하려면 어떻게 해야할까요 ? (try ~ catch는 아직 안배웠으니 나중에 ㅎㅎㅎ)
		// Hint) 전달받은 문자열이 모두 정수로 구성되어 있는지 아닌지 판별하는 함수를 만들어서 사용해보세요.
		
		Scanner sc = new Scanner(System.in);
		// 입력받을 변수를 선언\
		String input = null;
		
		while(true) {		// continue 는 여기로 와서 다시 코드를 진행 
			
			System.out.print("정수 입력 : ");
			input = sc.next();
			// 문자를 입력하면 syserr를 통해서 잘못입력했다는 메시지를 출력하게 처리하세요.
			if(isNumeric(input) == false) {
				System.err.println("정수를 입력해야 합니다 !! (0 ~ 3)");
				continue;
			}
			
			switch(input) {
			
			// 1, 2, 3은 입력받은 값을 그대로 출력하고
			case "1" : case "2" : case "3":
				System.out.println("input : " + input);
				break;
			// 0은 종료
			case "0":
				System.out.println("프로그램 종료 ! ");
				sc.close();
				return;
			}
		}	// end of while (break)
	}	// end of main
}	// end of class
