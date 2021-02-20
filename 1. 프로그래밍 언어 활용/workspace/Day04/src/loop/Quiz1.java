package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 문제 1. while을 이용하여 자신의 이름을 3번만 출력하세요.
		
		int num = 0;
		
		while(num < 3) {
			System.out.println("박 윤 환");
			num++;
		}
		
		// 문제 2. while을 이용하여 한줄에 1부터 20까지 출력하세요. (띄어쓰기로 구분)
		
		int num1 = 1;
		
		while(num1 <=20) {
			System.out.print(num1 + " ");
//			System.out.print(num1++ + " ");
//			단항 증감 연산자. 전치(먼저 증감시키고 코드를 수행), 후치(수행한 이후 값의 증감)
			num1++;
		}
		
		System.out.println();
		
		// 문제 3. while을 이용하여 한줄에 대문자A부터 Z까지 출력하세요. (띄어쓰기로 구분)
		// char 은 본질적으로 정수 데이터이기 때문에 굳이 ASCII코드를 찾아가지 않아도 괜찮다.
		
		char ch = 65; // char ch = 'A';
		
		while(ch <= 90) {	// while(ch <= 'Z'){
			System.out.print(ch + " ");
			ch++;
		}
		
		System.out.println();
		
		// 문제 4. while을 이용하여 입력받은 정수를 거꾸로 출력하세요. (1234 -> 4321)
		// 정수의 범위를 벗어나면 예외가 발생함.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();	// 입력 버퍼에서 정수만 가져간다.(\n이 남는다.)
		// sc.nextLine(); 			// 남아있는 \n을 제거한다.
		
		while(num2 != 0) {
			int tmp = num2 % 10;
			System.out.print(tmp);
			num2 /= 10;
		}
		
//		while(true) {				
//			tmp += num2 % 10;		입력받은 수에서 끝자리를 떼어내서 tmp에 더한다.
//			tmp *= 10;				1의 자리를 비우기 위해 10을 곱한다.
//			num2 /= 10;				처리된 맨 끝 자리를 날리기 위해 10으로 나눈다.
//			if(num2 < 10) {			만약 10보다 작으면(한자리수만 남으면)
//				tmp += num2;		남은 한자리를 더하고
//				break;				반복을 중단한다.
//			}
//		}
		
		System.out.println();
		
		// 문제 5. while을 이용하여 문자열을 입력받고, 문자열의 길이가 8미만이면 새로 입력받으세요.
		//		  길이 8이상의 문자열을 입력받았다면 화면에 출력하고 종료하세요.
		
		while(true) {
			
			System.out.print("문자열 입력 : ");
			String str = sc.next();
//			input = sc.nextLine();		띄워쓰기를 포함하여 엔터까지 입력받기.
			
			if(str.length() < 8) {
				System.err.println("8자 미만 다시입력");
				continue;
			}
			else {
				System.out.println(str);
				break;
			}
		}
		
		sc.close();
		
		System.out.println();
		
		// 문제 6. 첫날에 10원, 다음날은 20원, 다음날은 40원..
		//		  전날의 2배를 은행에 입금하면 30일이 경과한 후 은행의 잔고는 얼마인지 계산하세요.
		// 자료형 구분 !!!!!!!!!!!!!!!!!!!!
		
		long money = 10;
		long day = 1;
		
		while(day <= 30) {
			System.out.print(day + "일차 입금 금액 : " + money + "원");
			day++;
			money *= 2;
			System.out.print("\t\t잔액 : " + money +"원\n");
		}
		
		System.out.println("\n총 은행 잔고 : " + money +"원");
		
//		< 풀이 >		
//		long income = 10, account = 0, day = 1;
//		
//		while(day <= 30) {
//			account += income;		// 계좌에 입금한다.
//			System.out.printf("%,d원 입금 / 잔고 : %,d원 / %d일차\n",income, account, day);		// %,d 정수를 구분할 때 천단위를 구분지어준다.
//			income *= 2;			// 입금할 돈을 두배로 준비합니다.
//			day++;					// 하루가 지나갑니다.
//		}
//		System.out.printf("계좌금액 : %,d원\n", account);
		
	}
}
