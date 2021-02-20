package day07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		// Scanner를 이용하여 5개의 정수를 임의로 입력받고
		// 합계와 평균을 출력하세요.
		// (각 점수가 0 ~ 100 범위를 벗어나면 다시 입력받게 처리하세요.)
		// (평균은 소수점 둘째자리까지만 출력하세요.)

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;
		double avg;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]번 정수 입력 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (arr[i] > 100 || arr[i] < 0) {
				System.err.println("범위오류! 다시입력!");
				i--;
			}
		}
		avg = sum / 5.0;
		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, avg);
		sc.close();

//		----------------------------------------------------------
//		
//		int[] arr = new int[5];
//		
//		int sum = 0;
//		double avg;
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0 ; i < arr.length; i++) {
//			// if, while, for(;;)
//			
//			do {		// 일단 한번 실행하고
//				System.out.printf("arr[%d] 정수 입력 : ", i);
//				arr[i] = sc.nextInt();
//			}while(arr[i] < 0 || 100 < arr[i]);		// 반복여부를 결정
//
//			sum += arr[i];
//		}
//		
//		avg = sum / 5.0;
//		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, avg);
//		sc.close();
//		
//		------------------------------------------------------------
	}
}
