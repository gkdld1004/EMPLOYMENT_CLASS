package day06;

public class Ex02_Overloading {
	// 메서드 오버로딩을 구분하는 기준은 매개변수의 자료형이나 개수이다.
	// 반환자료형 함수이름 (매개변수)
	
	static int getMax(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	static double getMax(int n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	static double getMax(double n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	static double getMax(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	static int getMax(char ch1, char ch2) {
		return ch1 > ch2 ? ch1 : ch2;
	}
//	static int getMax(double n1, double n2) {	// 인수가 똑같아서 이클립스가 구분을 못함. 완전히 똑같은 것은 만들 수 없음.
//		return (int)(n1 > n2 ? n1 : n2);
//	}
	
	public static void main(String[] args) {
		
	}
}
