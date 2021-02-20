package day17_quiz1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Handler hd = new Handler();
		
		// while ~ switch ~ case 메뉴 구성
		
		// 1. 신규 캐릭터 추가
		// 2. 이름으로 캐릭터 찾기
		// 3. 캐릭터 정보 수정
		// 4. 삭제
		// 0. 종료
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		String name;
		int atk, hp;
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 신규 캐릭터 추가");
			System.out.println("2. 이름으로 캐릭터 찾기");
			System.out.println("3. 캐릭터 정보 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("신규 캐릭터를 생성합니다");
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("공격력 입력 : ");
				atk = sc.nextInt();
				System.out.print("체력 입력 : ");
				hp = sc.nextInt();
				PlayableCharacter newbie = 
						new PlayableCharacter(name, atk, hp);
				boolean insert = hd.insert(newbie);
				System.out.println(insert ? "성공" : "실패");
				break;
			case 2:
				System.out.println("캐릭터를 검색합니다");
				System.out.print("검색할 이름 입력 : ");
				name = sc.next();
				PlayableCharacter find = hd.selectOne(name);
				if(find != null) {
					System.out.println(find);
				}
				else {
					System.out.println("결과를 찾을 수 없습니다 !");
				}
				break;
			case 3:
				System.out.print("수정할 캐릭터의 이름을 입력 : ");
				name = sc.next();
				boolean modify = hd.modify(name);
				System.out.println(modify ? "성공" : "실패");
				break;
			case 4:
				System.out.print("삭제할 캐릭터의 이름을 입력 : ");
				name = sc.next();
				boolean delete = hd.delete(name);
				System.out.println(delete ? "삭제 성공" : "삭제 실패 : 데이터가 없습니다");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			}
			
		}
		
	}
}
