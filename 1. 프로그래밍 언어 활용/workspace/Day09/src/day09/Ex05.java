package day09;

import java.util.Scanner;

class TV{
	// 속성정보를 필드로 구성하세요. 초기값을 할당해도 됩니다.
	// 필요하다면 Scanner를 선언하세요.
	
	// 기능을 메서드로 구성하세요. 매개변수는 자유롭게 설정합니다.
	// 화면출력기능은 반드시 존재해야 합니다.
	// 멤버 메서드간의 호출도 허용합니다.
	
	boolean power = false;
	int ch = 0, vl = 0;
	Scanner sc = new Scanner(System.in);
	
	void onOff() { power = !power; }

	void start() {		// main 함수 역할 -> 제어 파트
		System.out.print("1. 전원 > \n");
		System.out.print("2. ch+ > \n");
		System.out.print("3. ch- > \n");
		System.out.print("4. vl+ > \n");
		System.out.print("5. vl- > \n");
		System.out.print("6. 끝내기 > \n");
		System.out.println();
		while(true) {
			System.out.print("입력 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				onOff();
				break;
			case 2:
				chUp();
				break;
			case 3:
				chDn();
				break;
			case 4:
				vlUp();
				break;
			case 5:
				vlDn();
				break;
			case 6:
				System.out.println("이제그만 !");
				return;
			default:
				System.err.println("잘못된 입력");
			}
			show();
		}
	}
	
	void chUp() {
		if(power == true)
			ch += 1;
	}
	
	void chDn() {
		if(power == true) {
			if(ch > 0) {
				ch -= 1;
			}
			else {
				System.err.println("내려갈 곳 없음");
			}
		}
	}
	
	void vlUp() {
		if(power == true)
			vl += 1;
	}
	
	void vlDn() {
		if(power == true) {
			if(vl > 0) {
				vl -= 1;
			}
			else {
				System.err.println("내려갈 곳 없음");
			}
		}
	}
	
	void show() {
		System.out.println("전원 : " + ((power) ? "ON" : "OFF"));
		if(power == true) {
			System.out.print("┌─────────┐\n");
			System.out.printf("│ ch : %3d│\n", ch);
			System.out.printf("│ vl : %3d│\n", vl);
			System.out.print("└─────────┘\n");
			System.out.println();
		}
		else {
			System.out.print("┌─────────┐\n");
			System.out.printf("│ 	  │\n", ch);
			System.out.printf("│ 	  │\n", vl);
			System.out.print("└─────────┘\n");
			System.out.println();
			ch = 0; vl = 0;
		}
	}
}

public class Ex05 {
	public static void main(String[] args) {
		
		/* ※ 객체(Object)의 속성과 기능
		
	 	- 속성 : 객체를 구성하는 세부 데이터
		 	멤버 필드
	 		ex) 사람 = { 이름, 나이, 전화번호, 성별... } 
				ㄴ> 변수에 담을 수 있는 정보 (명사)
		
		------------------------------------------
				
		- 기능 : 데이터를 기반으로 하여 움직임을 나타내는 코드의 묶음
			메서드
			ex) 사람이 자기소개를 한다.
				사람이 걷는다.
				사람이 다른 곳으로 이동한다.
		*/
		
		TV tv = new TV();
		
		tv.start();
		
		
	}
}
