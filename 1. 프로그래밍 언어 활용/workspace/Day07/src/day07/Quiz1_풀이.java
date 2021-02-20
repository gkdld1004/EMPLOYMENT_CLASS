package day07;

public class Quiz1_풀이 {
	public static void main(String[] args) {
		
		int[] arr = { 42, 17, 27, 65, 63, 64, 20, 15, 32 };
		
		// 1. arr의 홀수번째 멤버의 합계를 출력하세요.	(i = index, iterable(반복가능한))
		
		int oddSum = 0;
		for(int i = 0; i < arr.length; i++) {	// 배열 전체 중에서
			if(i % 2 != 0)						// 순번이 홀수이면
				oddSum += arr[i];				// 합계에 더해라.
		}
		System.out.println("1. 홀수번째의 합계 : " + oddSum);
		
		// 2. arr의 짝수번째 멤버의 합계를 출력하세요.
		
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++) {	// 배열 전체 중에서
			if(i % 2 == 0)						// 순번이 홀수이면
				evenSum += arr[i];				// 합계에 더해라.
		}
		System.out.println("2. 짝수번째의 합계 : " + evenSum);
		
		// 3. arr와 크기가 같은 빈배열 arr2를 생성하고, 내용을 그대로 복사하세요.
		
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.print("3. arr2 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		
		// 4. arr2를 오름차순으로 정렬하세요.
		
		for(int i = 0 ; i < arr2.length; i++) {
			for(int j = i; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		
		System.out.print("4. 오름차순 정렬 후 arr2 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		
		System.out.print("4. 기존 arr : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		// 5. arr에서 값의 크기가 짝수인 값만 가져와서, 새로운 배열 arr3을 생성하고 출력하세요.
		
		// ⅰ) arr에서 짝수인 값은 총 몇 개인가 ?	(배열은 크기를 변경할 수 없기 때문에 !!)
		
		int count = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				count += 1;
		}
		
		// ⅱ) 1에서 구한 크기를 이용해서 새로운 배열 arr3를 생성
		
		int[] arr3 = new int[count];
		int[] arr4 = new int[count];
		
		// ⅲ) arr에서 짝수인 값만 찾아서 arr3에 순서대로 대입
		
		// 3-1)
		int cnt = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr3[cnt++] = arr[i];
			}
		}
		
		// 3-2)
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				for(int j = 0; j < arr4.length; j++) {
					if(arr4[j] == 0) {
						arr4[j] = arr[i];
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		
		
	}
}
