package day06;

public class Quiz3 {
	
	static boolean isInteger(String str) {
		// 1. 전달받은 문자열을 char의 배열로 바꾸어서 다른 변수에 저장한다.
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			boolean check = ch[i] >= '0' && ch[i] <= '9';
			if(check == false)
				return false;
		}
		return true;
		
//		for(int i = 0; i < str.length(); i++) {
//			if(('0' <= str.charAt(i) && str.charAt(i) <= '9') == false)
//				return false;
//		}
//		return true;
		
		// 2. for문을 이용하여 처음부터 끝까지 순회한다.
		// 		만약 i번째 글자의 범위가 0에서 9사이라면 정수이다.
		// 		조건에 맞지 않으면 false를 반환한다.

//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);		// t, e, x, t, 1, 2, 3, 4
//			boolean check = '0' <= ch && ch <= '9';		// 정수일 조건
//			if(check == false)	// 정수가 아니면
//				return false;	// 그 즉시 false를 반환하고 종료
//		}
//		return true;			// 전체를 순회했다면 (모든 글자가 정수이므로) return true
		
		// 3. for문 전체를 순회하고도 범위에서 벗어나는 글자를 발견하지 못했다면 true를 반환한다.
	}
	
	public static void main(String[] args) {
		
		boolean flag1 = isInteger("text");
		boolean flag2 = isInteger("1234");
		System.out.println("text는 전체가 정수입니다. : " + flag1);
		System.out.println("1234는 전체가 정수입니다. : " + flag2);
//		
//		if(isInteger("text"))
//			System.out.println(Integer.parseInt("text"));
//		if(isInteger("1234"))
//			System.out.println(Integer.parseInt("1234"));
		
	}
}
