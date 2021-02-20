package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// ########## 100% ##########
		
		// 위 형식의 설치 진행률 표시를 만들려고 한다.
		// 진행률을 정수로 입력받아서 개수만큼 # 기호가 출력되고
		// 진행률 숫자는 가운데 출력되는 형식을 만드세요.
		// # 기호 하나는 5%를 의미 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("진행률 입력 : ");
		int n = sc.nextInt();
		
		System.out.print("[");
		for(int i = 1; i <= 20 ; i++) {
			if(i == 10)
				System.out.print(n + "%");
			if(i <= n/5) {
				System.out.print("#");
			}
			else
				System.out.print(" ");
		}
		System.out.print("]");
		
		sc.close();
	}
}
