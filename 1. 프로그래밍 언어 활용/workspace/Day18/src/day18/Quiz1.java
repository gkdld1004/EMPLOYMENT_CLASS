package day18;

import java.util.Hashtable;
import java.util.Scanner;

public class Quiz1 {
	static Hashtable<String, String> account = new Hashtable<String, String>();
	
	static boolean login(String userid, String userpw) {
		String result = account.get(userid);
		// 1) 만약 ID가 존재하지 않는다면 result는 null
		// 2) 만약 ID가 존재한다면, result는 가입시 입력했던 pw
		// => result와 userpw가 일치하면 로그인 성공, 아니면 로그인 실패
		
		// 3) userpw와 result를 비교하기 전에, 어떤 값이 null일지 생각해보자
		// equals()로 비교할 때, null이 아닐 값을 왼쪽에 두어 비교하자
		
		return userpw.equals(result);		// 일치하면 true, 아니면 false
		
	}
	
	public static void main(String[] args) {
		// 사용자 지정 클래스 없이 Hashtable을 이용하여, 간단한 로그인 함수를 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// key는 중복될 수 없다. (id는 중복되지 않는다)
		// value는 중복될 수 있다.(서로 다른 계정의 비밀번호가 우연히 같을 수는 있다.)
		
		// while, switch ~ case
		// 1. 가입 : 아이디와 비밀번호로 가입하여 account에 추가하기
		// 2. 로그인 : 성공, 실패 여부를 출력하기
		// 0. 종료
		
		int menu;
		
		while(true) {
			System.out.println("1. 가입");
			System.out.println("2. 로그인");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>>");
			menu = sc.nextInt();
			
			String userid;
			String userpw;
			switch(menu) {
			case 1:		// 함수 없이 가입 구현
				int beforeSize = account.size();
				System.out.println("\t회원가입\n");
				System.out.print("가입할 ID : ");
				userid = sc.next();
				System.out.print("사용할 PW : ");
				userpw = sc.next();
				account.put(userid, userpw);
				int afterSize = account.size();
				
				if(beforeSize == afterSize) {
					System.out.println("중복이므로 가입 안됩니다.");
				}
				else {
					System.out.println("가입 성공 ! ");
				}
				break;
			case 2:
				System.out.println("\t로그인\n");
				System.out.print("ID : ");
				userid = sc.next();
				System.out.print("PW : ");
				userpw = sc.next();
				boolean login = login(userid, userpw);
				if(login) {
					System.out.println(userid + " : 로그인 되었습니다.");
				}
				else {
					System.out.println("로그인 실패 ! ");
				}
				break;
			case 0:
				System.out.println("종료 !");
				sc.close();
				return;
			}
		}
	}
}
