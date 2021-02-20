package day03;

public class Ex03_String {
	public static void main(String[] args) {
		
		// String : 자바에서 문자열을 다루는 기본적인 자료형 (클래스)
		
		String name = "이지은";	// 선언 및 초기화
		String address;			// 선언
		address = "서울";			// 대입
		
		String str = new String("문자열");	// 클래스에 의해서 생성된 객체
		
		int num = 10;	// 순수 데이터만 저장하고 있다. (기능은 포함하지 않는다.)
		System.out.println(num);
		
		System.out.println(name + ", " + address);
		System.out.println(str);
		
		System.out.println(str.length());	// 문자열의 길이 (int)
		System.out.println(str.charAt(1));	// 지정한 순번의 글자를 추출
		
		System.out.println(str.equals("문자열아님"));
		System.out.println(str.equals("문자열"));
		System.out.println(str == "문자열");	// 단어 혹은 문장들은 연산으로는 비교가 되지 않는다.
		
		System.out.println(str.replace("열", "가"));	// 내용에서 패턴을 찾아서 원하는 형태로 바꾸고 싶은 경우
		
		String favorite = "참깨라면 950원";
		System.out.println(favorite);
		String cookie = favorite.replace(" ", "_");
		System.out.println(cookie);
		
	}
}
