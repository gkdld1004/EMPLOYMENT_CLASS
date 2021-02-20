package day08;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * 		1   2  3  4   5
		 * 		6   7  8  9  10
		 * 		11 12 13 14  15
		 * 		16 17 18 19  20
		 * 		21 22 23 24  25
		 */
		
		//				   [세로][가로]
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0 || j == 0 || i == 4 || j ==4) {
					arr[i][j] = 1;
					System.out.printf("%2d ", arr[i][j]);
				}
				else {
					arr[i][j] = 0;
					System.out.printf("%2d ", arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
