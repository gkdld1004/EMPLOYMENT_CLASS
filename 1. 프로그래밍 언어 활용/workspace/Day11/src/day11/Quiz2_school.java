package day11;

import java.util.Scanner;

class Student {
	// 필드
	private String name;
	private int kor, eng, math, sum;
	private double avg;

	// 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng + math;
		avg = sum / 3.0;
	}

	// 메서드 (getter, setter)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public double getAvg() {
		return sum;
	}
}

class Handler {
	// 길이 10의 Student 배열
	private Student[] arr = new Student[10];
	private Scanner sc = new Scanner(System.in);
	
	// 입력함수
	private void createStudent() {
		String name; 		// 입력값을 받기 위한 임시변수
		int kor, eng, math;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("국어 점수 : ");
				kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				eng = sc.nextInt();
				System.out.print("수학 점수 : ");
				math = sc.nextInt();
				
				arr[i] = new Student(name, kor, eng, math);		// 입력을 다하고 나면 새로운 객체를 생성
				System.out.println(name + " 학생 생성 완료 !\n");
				return;
			}
		}
		System.err.println("더 이상 학생을 추가할 수 없습니다 !!\n");	
	}
	
	// 출력함수
	private void showAllStudent() {
		System.out.println("====== 전체 학생 ======");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				String format = "%s : %d, %d, %d (합계 : %d, 평균 : %.2f)\n";
				System.out.printf(format, arr[i].getName(),
						arr[i].getKor(), arr[i].getEng(), arr[i].getMath(),
						arr[i].getSum(), arr[i].getAvg());
			}
		}
		System.out.println();
	}
	
	// start()
	public void start() {

		while (true) {
			System.out.println("1. 신규 학생 생성 및 입력");
			System.out.println("2. 전체 출력");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				createStudent();
				break;
			case 2:
				showAllStudent();
				break;
			case 0:
				System.out.println("종료 !");
				return;
			default:
				System.err.println("잘못된 입력!");
			}

		}
		
	}
}

public class Quiz2_school {
	public static void main(String[] args) {

		Handler h1 = new Handler();
		h1.start();

	}
}
