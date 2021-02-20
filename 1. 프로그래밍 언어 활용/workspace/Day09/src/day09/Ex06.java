package day09;

import java.util.Scanner;

class Student2 {
		// 입력함수와 출력함수를 구현하고
		// 세 과목의 점수를 입력받으면
		// 자동으로 합계와 평균이 계산되어 저장되도록 클래스를 설계하세요.
	
	String name;	// = null
	int kor, eng, math, sum;	// = 0
									
	/*
	 * 멤버 필드는 객체 생성 이후 자료형에 따라서 자동으로 초기화가 진행된다.
	 *	primitive : 0에 기반한 자료형의 값
	 * 		└> byte, char, short, int, long => 0
	 *			float, double => 0.0
     *			boolean => false
	 * reference : 대상을 참조하고 있지 않다. => null;
	 *
	 *	클래스의 멤버 필드는 초기화가 자동으로 진행되지만, 메서드의 지역 변수는 초기화되지 않는다.
	 *	
	 */
	
	double avg;
	Scanner sc = new Scanner(System.in);		// 멤버 필드는 초기화 가능 
	
	void input() {		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		// 세 과목의 점수를 입력받자
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;		// 합계와 평균을 계산해서 멤버필드에 저장
		avg = sum / 3.0;			// 메서드가 종료되어도 멤버필드는 유지된다.
	}
	
	void show() {
		System.out.println(name + "의 국영수 합계는 " + sum + "점이고, 평균은 " + String.format("%.2f", avg) + "점이다.");
		
//		String form = "%s) %3d, %3d, %3d, %3d / %3d / %.2f\n";
//		System.out.printf(form, name, kor, eng, math, sum, avg);
		
	}
}

public class Ex06 {
	public static void main(String[] args) {
		
		Student2[] arr = new Student2[5];		// { null, null, null, null, null }
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		while(true) {
			System.out.println("1. 신규 학생 정보 입력");
			System.out.println("2. 전체 학생 정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				for(int i = 0; i < arr.length; i++) {	// 배열에서
					if(arr[i] == null) {				// 빈칸을 하나 찾아서
						arr[i] = new Student2();		// 새로운 학생 개체를 생성하고 - 클래스이름을 함수로 호출하면 생성가능
						arr[i].input();					// 입력 메서드를 실행해라
						break;							// 입력이 끝나면 순회를 종료한다.
					}
				}
				break;
			case 2:
				for(int i = 0; i < arr.length; i++) {	// 배열에서
					if(arr[i] != null) {				// 빈칸이 아닌 곳을 찾아서
						arr[i].show();					// 그 객체의 출력 메서드를 출력해라.
					}
				}
				break;
			case 0:
				System.out.println("프로그램 종료 !");
				sc.close();
				return;
			default:
				System.err.println("잘못된 입력 !");
			}
			
		}		// while
	}		// main
}		// class
