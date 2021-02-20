package day08;

public class Ex03 {
	
	static void print2dArr(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) { // 여러 줄 중에
			for (int j = 0; j < arr[i].length; j++) { // 한 줄을 출력
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println(); // 한 줄이 끝나면 줄 바꿈
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int size = 5;
		
		int[][] arr = new int[size][size];
		print2dArr(arr);
		
		// 1)
		/*			1	10	11	20	21
		 * 			2	9	12	19	22
		 * 			3	8	13	18	23
		 * 			4	7	14	17	24
		 * 			5	6	15	16	25
		 */
		
		// 2)
		/*
		 * 			1	2	3	4	5
		 * 			16	17	18	19	6
		 * 			15	24	25	20	7
		 * 			14	23	22	21	8
		 * 			13	12	11	10	9
		 */
		
		System.out.println("========= 1 =========\n");
		
		int num = 1;
		int[][] arr1 = new int[size][size];
		
		for(int i = 0; i < arr1.length; i++) {
			if(i % 2 ==0) {
				for(int j = 0; j < arr1[i].length; j++) {
					arr1[j][i] = num++;
				}
			}
			else {
				for(int j = arr1[i].length - 1; j >= 0; j--) {
					arr1[j][i] = num++;
				}
			}
		}
		
		// 풀이
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				int y = j;
//				if(i % 2 == 1)
//					y = arr[i].length - 1 -j;
////				int y = i % 2 == 0 ? j : (arr[i].length - j - 1);
////				System.out.println(i + ", " + y + " : " + num);
//				arr[j][i] = num++;
//			}
//		}
		
		print2dArr(arr1);
		
		System.out.println("========= 2 =========\n");
		// 인터넷보고함
		int[][] arr2 = new int[size][size];
		
		int print = 5; 
		int k = 1;
		int right = -1;
		int bottom = 0;
		int top = 1;
		
		for(int i = 5; i > 0; i--) {
			
			for(int j = 0; j < print; j++) {
				right += top;
				arr2[bottom][right] = k;
				k++;
			}
			
			print--;
			
			for(int j = 0; j < print; j++) {
				bottom += top;
				arr2[bottom][right] = k;
				k++;
			}
			
			top = top * (-1);
			
		}
		
		
		print2dArr(arr2);
	}
}
