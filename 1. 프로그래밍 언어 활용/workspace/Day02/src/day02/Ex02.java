package day02;

public class Ex02 {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		short sh1;				// 변수의 선언 : 자료형 변수 이름;
		
		char ch2 = '가';			// 변수의 선언 및 초기화 : 자료형 변수 이름 = 값;	// 44032;
		short sh2 = 0;			
		
		sh1 = (short)ch1;		// char 는 표현 형태가 문자이기 때문에 ?	// 강제형변환하면 값의 손실 없이 데이터를 이동시킨다
		sh2 = (short)ch2;		// char 는 unsigned  				// 강제형변환하면 값의 손실이 발생하지만 이동가능
														// 정수형태도 같고 크기도 같으나 값의 표현범위가 다르기 때문에
		
		ch1 = (char)sh1;
		ch2 = (char)sh2;
		
		System.out.println(sh1);
		System.out.println(sh2);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
	}
}
