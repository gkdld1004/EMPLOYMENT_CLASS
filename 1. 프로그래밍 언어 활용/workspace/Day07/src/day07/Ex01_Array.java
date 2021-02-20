package day07;

public class Ex01_Array {
	public static void main(String[] args) {
		
		// 변수 : 어떤 데이터를 담기 위한 자료형 크기에 따른 메모리 공간.
		
		// 배열 : (같은 자료형의) 여러 데이터를 연속적인 공간에 담아서 관리하기 위한 구조.
		
		int n1 = 11, n2 = 22, n3 = 33, n4 = 44, n5 = 55;		// 지멋대로 서있는 변수들
		int sum1 = 0;
		
		sum1 += n1;		// 변수의 개수가 증가할 때마다 
		sum1 += n2;		// 처리하는 식이 점점 같이 증가한다.
		sum1 += n3;		
		sum1 += n4;
		sum1 += n5;
		
		System.out.println("sum1 : " + sum1);

		int[] arr = { 12, 23, 34, 45, 56 };		// 줄 지어 서있는 변수들
		int sum2 = 0;
		
//		sum2 += arr[0];
//		sum2 += arr[1];
//		sum2 += arr[2];
//		sum2 += arr[3];
//		sum2 += arr[4];
		
		// 길이가 더 길어져도 식이 변하지 않는다.
		for(int i = 0; i < arr.length; i++) {		
			sum2 += arr[i];
		}
		
		// 순번에 상관없이 배열 내부에 있는 모든 멤버에 대해서 실행한다.
		int sum3 = 0;
		for(int num : arr)
			sum3 += num;
		
		System.out.println("sum2 : " + sum2);
		System.out.println("sum3 : " + sum3);
		
		// 배열을 생성하는 방법
		
		int[] arr2;			// []는 배열 타입이라는 것만을 알려주는 것이다.
		int arr3[];
//		int arr4[5];	(X)		// 선언하면서 배열이름에 길이를 넣지 않는다.
		
		int[] arr5 = new int[5];	// 1) 길이를 알려주고 만든 배열	( 5칸의 비어있는 배열 )
		
		for(int num : arr5) {
			System.out.println("num : " + num);		// 자동으로 값을 0으로 초기화
		}
		
		int[] arr6 = new int[] { 4, 2, 8, 6, 7 };		// 2) 요소를 직접 작성한 배열 
		
//		int[] arr7 = new int[5] { 1, 2, 3, 4, 5 };	(X)
		// 길이와 요소를 동시에 제공하지 않는다.!!
		
		
		int[] arr8 = new int[] { n1, n2, n3, n4, n5 };
		
		int sum8 = 0;
		for(int num : arr8) {
			sum8 += num;
		}
		double avg = sum8 / (double)arr8.length;
		System.out.println("합계 : " + sum8 + ", 평균 : " + avg);
		
		
		// ------------------< 배열  >-----------------------
		
		// 배열은 순번(첨자, index)을 기반으로 값(value)에 접근하는 구조이다.
		// 배열의 멤버 요소는 일반 변수와 동일하게 취급한다.
		// 이미 만들어진 값을 배열로 묶는 것도 가능하다.
		// 배열의 순번은 항상 0부터 시작한다.
		// 배열의 마지막 순번은 [arr.length - 1]이다.
		// 배열의 길이와 같은 순번은 존재하지 않는다.
		
		// 만약 배열의 범위를 벗어나는 접근을 시도하면 
		// ArrayIndexOutOfBoundsException을 발생시킨다.
		
		// ------------------------------------------------
		
	}
}
