package day07;

public class Ex04_Sort {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 8, 2, 7, 6 };
		
		System.out.print("arr 전: ");		// 정렬 전 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		// 선택정렬 
		for(int i = 0 ; i < arr.length - 1; i++) {		// 기준	// 마지막 값은 기준으로 삼지않는다.
			for(int j = i + 1; j < arr.length; j++) {		// 대상	// 기준 다음 값부터 
				if(arr[i] > arr[j]) {		// 기준과 대상의 값을 바꿀 조건
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("arr 후: ");		// 정렬 전 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
	}
}
