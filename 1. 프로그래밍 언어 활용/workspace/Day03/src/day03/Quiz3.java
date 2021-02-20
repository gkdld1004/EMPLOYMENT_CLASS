package day03;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 문제. 버스 한 정거장 이동할 때 3분이 걸린다고 가정한다.
		// 이동한 정거장 수를 입력받아서, 걸린 시간을 계산하여 출력하는 코드를 작성하세요.
		// 단, 시간이 60분을 초과하면 h시간 mm분의 형식으로 출력하세요.
		
		// 예시)
		// 입력 : 3
		// 출력 : 9분
		// 입력 : 21
		// 출력 : 1시간 3분
		
//		// 1) 변수의 선언 및 초기화
//		int station, perStation = 3, time;
//		Scanner sc = new Scanner(System.in);
//		
//		// 2) 값이 할당되지 않은 변수 중, 입력받는 변수는 입력 진행
//		System.out.println("정거장 수 입력 : ");
//		station = sc.nextInt();
//		
//		// 3) 값이 할당되지 않은 변수 중, 연산처리해서 답을 구해야 하면 연산 진행
//		time = station * perStation;
//		
//		// 4) 모든 값이 준비되었다면, 조건에 따라서 값을 출력
//		if(time > 60) {
//			System.out.printf("%d시간 %d분\n",time / 60, time % 60);
//		}
//		else {
//			System.out.println(time + "분");
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		int busSta;
		
		System.out.print("입력 : ");
		busSta = sc.nextInt();
		
		int time = busSta * 3;
		
		if(time > 60) {
			int hour = time / 60;
			int min = time % 60;
			System.out.println("출력 : " + hour + "시간 " + min + "분");
		}
		else {
			System.out.println("출력 : " + time + "분");
		}
		
		sc.close();
		
	}
}
