package day02;

public class Quiz {
	public static void main(String[] args) {
		
		String name;
		int age;
		
		// 위 변수에 자신의 이름과 나이를 대입하고 올해 연도를 이용하여 출생연도를 구하세요.
		
		// 이름과 나이와 출생연도를 화면에 출력하세요.
		// 별도의 변수를 생성해도 괜찮습니다.
		
		name = "박윤환";
		age = 31;
		
		int birthYear = 2020 - age + 1;
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "이며, 출생연도는 " + birthYear + "년 입니다.");
		
		// String 으로 결과값을 만들어서 바로 결과값을 출력해도된다.
	}
}
