package day05;

public class Quiz {
	public static void main(String[] args) {

		// 구구단 표 만들기 
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 5; j++) {
				System.out.printf("%d X %d = %2d\t",  j, i, i * j);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------");
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 6; j <= 9; j++) {
				System.out.printf("%d X %d = %2d\t",  j, i, i * j);
			}
			System.out.println();
			
		}

	}
}
