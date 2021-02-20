package day09;

import java.util.Scanner;

class PhoneBook{
	
	String name;		// 이름을 저장할 멤버필드
	String pnum;		// 전화번호를 저장할 멤버필드
	Scanner sc = new Scanner(System.in);

	void show() {		// 멤버 필드의 내용을 참조하여 실행하는 함수, 멤버 메서드
		System.out.println(name + " : " +pnum);
	}
	
	void input() {
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print(name + "의 전화번호 입력 : ");
		pnum = sc.nextLine();
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		PhoneBook p1 = new PhoneBook();
		PhoneBook p2 = new PhoneBook();
		PhoneBook p3 = new PhoneBook();
		
		// 입력
//		System.out.print("이름을 입력 : ");
//		p1.name = sc.nextLine();
//		
//		System.out.print(p1.name + "의 전화번호를 입력 : ");
//		p1.pnum = sc.nextLine();
//		
//		System.out.print("이름을 입력 : ");
//		p2.name = sc.nextLine();
//		
//		System.out.print(p2.name + "의 전화번호를 입력 : ");
//		p2.pnum = sc.nextLine();
//		
//		System.out.print("이름을 입력 : ");
//		p3.name = sc.nextLine();
//		
//		System.out.print(p3.name + "의 전화번호를 입력 : ");
//		p3.pnum = sc.nextLine();
		
//		PhoneBook[] arr = new PhoneBook[3];		// 길이만 제공하고 빈칸이 만들어진다. (객체가 없다.)
		PhoneBook[] arr = new PhoneBook[] {p1, p2, p3};
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i].input();
		}
		
		// 출력
		for(int i = 0 ; i < arr.length; i++) {
			arr[i].show();
		}
		
//		p1.show();
//		p2.show();
//		p3.show();
		
	}
}
