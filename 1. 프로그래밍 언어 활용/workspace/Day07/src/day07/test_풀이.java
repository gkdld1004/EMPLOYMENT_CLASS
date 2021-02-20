package day07;

import java.util.Scanner;

public class test_풀이 {
	public static void main(String[] args) {

		// 길이가 자동으로 증가하는 배열을 만들어보자.
		// Scanner로 입력을 받으면서
		// 기존의 배열이 꽉차면, 지정된 크기만큼 증가한 새로운 배열을 생성하여
		// 기존 데이터를 복사하고, 나머지 빈 곳에 다시 입력을 받도록 한다.
		// 이때, 사용자가 0을 입력하면 더 이상 입력하지 않겠다는 신호로 간주하고 프로그램을 종료한다.

		Scanner sc = null; // 자료형이 대문자이거나, 배열자료형이면 참조변수이다. (null)
		int num = 0;
		int[] arr; // 기존 배열
		int[] tmp; // 임시 배열
		int size = 3;

		sc = new Scanner(System.in);
		arr = new int[size];

		while (true) {
			// 입력 (빈 칸에만 입력받기)
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) { // 빈 칸이면
					System.out.print("정수 입력 : ");
					num = sc.nextInt();
					if (num != 0) {
						arr[i] = num;
					}
					break; // 입력 받았다면 break;
				}
			}

			// 출력
			System.out.printf("출력 (%2d) : ", arr.length);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();

			// 0인지 체크 -> 종료
			if (num == 0) {
				sc.close();
				System.out.println("프로그램을 종료합니다 !");
				return;
			}

			// 배열이 꽉 찼는지 체크 -> 증가 및 복사 및 바꿔치기
			// 배열이 가득 찼다 == 배열의 마지막 값이 0이 아니다.
			// 배열[배열의 길이 - 1]
			// arr[arr.length - 1]

			if (arr[arr.length - 1] != 0) {
				tmp = new int[arr.length + size]; // 빈 배열, 0 0 0 0 0 0

				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i]; // 1 2 3 0 0 0
				}

				arr = tmp; // tmp가 가리키는 배열을 arr도 똑같이 가리키도록
							// (기존에 arr가 가리키던 배열은 소멸)
			}

		} // end of while

	} // end of main
} // end of class
