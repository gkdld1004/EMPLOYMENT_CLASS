package day20_wrapperClass;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		
		// Wrapper Class : 기본 자료형의 데이터를 객체 취급하기 위한 클래스
		// primitive type 과 1:1로 대응되는 자료형이 있다.
		
		boolean bo1 = true;		// 1byte, 논리
		byte by1 = 127;			// 1byte, 정수
		short sh1 = 32767;		// 2byte, 정수
		char ch1 = 65;			// 2byte, 정수 (글자)
		int num1 = 1234;		// 4byte, 정수
		long ln1 = 100L;		// 8byte, 정수
		float fl1 = 1.2f;		// 4byte, 실수
		double db1 = 3.14;		// 8byte, 실수
		
		Boolean bo2 = bo1;		// Wrapper Class 는 모두 4 Byte (참조 변수)
		Byte by2 = by1;			// Wrapper Class 는 데이터를 저장하는 기능도 포함하면서
		Short sh2 = sh1;		// 각 자료형에 맞는 메서드를 가지고 있다.
		Character ch2 = ch1;	// instance method 도 있고 (객체에서 호출하는 메서드)
		Integer num2 = num1;	// static method 도 있다. (자료형에서 호출하는 메서드)
		Long ln2 = ln1;
		Float fl2 = fl1;		// Wrapper Class 는 자신에 맞는 primitive와 1:1 대응되지만
		Double db2 = db1;		// 다른 Wrapper Class 와는 기본 형변환으로 대입이 안될 수 있다.
		
		num1 = ch1;				// 좌변의 변수가 범위가 더 크기 때문에, 암묵적 형 변환이 발생
//		num2 = ch2;				// 둘 다 클래스이고, 자료형이 일치하지 않아서 형 변환 처리가 안됨.
		
		num2 = (int)(char)ch2;	// (char)을 빼도 가능
		
		System.out.println("num2 : " + num2);
//		Character -> char -> int -> Integer
		
		fl2 = (float)(double)db2;
		fl2 = (float)db2.doubleValue();
//		Double -> double -> float -> Float
		System.out.println("fl2 : " + fl2);
		
		
//		primitive 데이터를 객체로 취급하기 위해서 
//		정보 은닉 개념에 따라, 크기에 따른 유형을 추측할 수 없도록 
//		클래스에서 제공하는 메서드를 활용하기 위해서
		
//		Generic Type을 지정할 때, Reference Type 만 지정 가능하기 때문에
//		정수를 담는 리스트를 구현하려면
//		
//		ArrayList<int> list = new ArrayList<int>();
//		위와 같이 제네릭에는 primitive를 지정할 수 없으므로 
		
		ArrayList<Integer> list = new ArrayList<Integer>();		// 반드시 객체 취급해야 할 때 사용하면 좋음~
		list.add(10);
		list.add(100);
		
	}
}
