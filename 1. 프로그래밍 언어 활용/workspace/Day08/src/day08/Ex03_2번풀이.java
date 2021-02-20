package day08;

public class Ex03_2번풀이 {

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

		int x = -1, y = 0, plus = 1, length = size;	// 5
		int n2 = 1;

		while (true) {

			for (int i = 0; i < length; i++) {
				x += plus;		
				arr[y][x] = n2++;
			}

			length -= 1;

			if (length == 0) {
				break;
			}

			for (int i = 0; i < length; i++) {
				y += plus;
				arr[y][x] = n2++;
			}

			plus = plus * -1;

		}
		print2dArr(arr);

	}
}
