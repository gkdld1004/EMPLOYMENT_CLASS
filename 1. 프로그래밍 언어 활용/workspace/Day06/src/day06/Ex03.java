package day06;

import java.util.Scanner;

public class Ex03 {
	
	static String insertDash(String str) {
		if(str.length() != 16) {
			System.err.println("문자열의 길이가 맞지 않습니다 !!");
			return null;		// 반환형이 명시되어 있으나 데이터를 반환하지 않고 싶은 경우
			// primitive 타입에서는 null을 사용할 수 없다.
		}
//		String test = str.substring(0, 4);	// 문자열의 인덱스를 이용해서 
//		System.out.println("test : " + test);
//		return null;
//		String s1 = null; (O)
//		int n1 = null; (X)
		
		String ret = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i % 4 == 0) {
//				System.out.println(str.substring(i, i + 4));
				ret += str.substring(i, i + 4);
				ret += i != 12 ? "-" : ""; 
			}
		}
//		System.out.println(ret);
		return ret;
	}
	
	public static void main(String[] args) {
		
		String result = insertDash("1234123412341234");
		// 전달받은 문자열의 길이가 16자리이면 4자리씩 끊어서 사이에 - 기호를 넣어서 반환하기.
		// 1234-1234-1234-1234
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("카드번호를 입력하세요 (16자리) : ");
		String input = sc.nextLine();
		System.out.println(insertDash(input));
		sc.close();
		
	}
}
