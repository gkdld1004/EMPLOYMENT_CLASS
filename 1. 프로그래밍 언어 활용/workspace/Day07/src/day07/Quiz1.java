package day07;

public class Quiz1 {
	public static void main(String[] args) {
		
		int[] arr = { 42, 17, 27, 65, 63, 64, 20, 15, 32 };
		
		// 1. arr의 홀수번째 멤버의 합계를 출력하세요.
		
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("1. arr의 홀수번째 멤버의 합계 : " + sum);
		System.out.println();
		
		// 2. arr의 짝수번째 멤버의 합계를 출력하세요.
		
		int sum1 = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			if(i % 2 == 0) {
				sum1 += arr[i];
			}
		}
		System.out.println("2. arr의 짝수번째 멤버의 합계 : " + sum1);
		System.out.println();
		
		// 3. arr와 크기가 같은 빈배열 arr2를 생성하고 내용을 그대로 복사하세요.
		
		int[] arr2 = new int[arr.length]; 
		System.out.print("3. arr2 = { ");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
			System.out.print(arr2[i]+ " ");
		}
		System.out.print("}");
		System.out.println("\n");
	
		// 4. arr2를 오름차순으로 정렬하세요.
		System.out.print("4. arr2를 오름차순 정렬 : ");
		
		for(int i = 0; i < arr2.length - 1; i++) {
			for(int j = i + 1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}System.out.println("\n");
		
		// 5. arr에서 값의 크기가 짝수인 값만 가져와서 새로운 배열 arr3을 생성하고 출력하세요.
		
		int[] arr3 = new int[arr.length]; 
		
		System.out.print("5. 짝수인 값만 가져와서 새로운 배열 arr3 = { ");
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
			if(arr3[i] % 2 == 0) {
				System.out.print(arr3[i] + " ");
			}
		}
		System.out.print("}");
		
	}
}
