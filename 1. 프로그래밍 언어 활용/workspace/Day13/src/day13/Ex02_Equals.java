package day13;

public class Ex02_Equals {
	public static void main(String[] args) {
		
		String a = "문자열";
		String b = "문자열";
		String c = "문자";
		String d = null;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));

		System.out.println(d.equals(a));
		//  java.lang.NullPointerException
		// 이클립스의 메서드 추천은 자료형에 의한 것이므로, 객체가 null인지 아닌지 판단하지 않는다.
		
	}
}
