package day07;

import java.util.Scanner;

public class test {

	static void printArr(int[] arr) {
		System.out.print("출력 (" + arr.length + ") : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		/*
		 * 
		 * ※ 자바에서 배열은 참조변수의 형태로 취급합니다.
		 * 
		 * int[] arr; 정수 배열을 참조할 수 있는 변수 arr
		 * 
		 * arr = new int[5]; 5개의 정수를 저장할 수 있는 배열을 생성하고 그 시작주소를 arr에 저장하여 arr이 방금 생성한 배열을
		 * 가리키게 한다.
		 * 
		 * arr = new int[10]; 10개를 저장할 수 있는 배열을 생성하고 기존 배열 대신 새 배열을 가리키게 한다.
		 * 
		 * int num = null; // 기본 자료형 변수 (primitive : 값을 직접 저장) String str = null; // 참조
		 * 형식 (reference : 참조 주소를 저장)
		 * 
		 */

		int[] arr;
		int[] tmp;
		Scanner sc = new Scanner(System.in);
		int size = 3;

		arr = new int[size];

		while (true) {
			// 1) 배열에서 빈 칸을 찾아서 하나 입력 받기
			// 2) 배열 크기만큼 요소를 출력
			// 3) 종료 체크
			// 4) 배열의 마지막 값이 0이 아니면 더 큰 배열을 생성함

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					System.out.print("입력 : ");
					arr[i] = sc.nextInt();
					if (arr[i] == 0) {
						System.out.print("======== 종료 ! ========\n");
						sc.close();
						return;		// 간단히 말하면, 메인함수를 종료시킨다. = System.exit(0)
						
					}
					printArr(arr);
				}
			}

			tmp = new int[arr.length + size];
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;

		}

	}
}
