package day10;

class Member {
	
	String name;
	int age;

	// 매개변수가 없는 기본형
	String info() { // 함수의 반환값은 함수의 호출형을 반환한다.
		String ret = name + "님은 " + age + "살 입니다.";
		return ret;
	}

	String info(String option) {
		// 문자열 비교는 >>> A.equals(B) 형태를 사용

		String ret;

//		if (option.equals("adult")) {
//			String adult = age >= 20 ? "성인" : "미성년자";
//
//			ret = name + "님은 " + age + "살이고 ";
//			ret += adult + "입니다.";
//		} else {
//			ret = info();
//		}

		// 자바는 switch ~ case에서 문자열을 비교할 수 있다.
		
		switch (option) {
		case "adult":
			String adult = age >= 20 ? "성인" : "미성년자";

			ret = name + "님은 " + age + "살이고 ";
			ret += adult + "입니다.";
			break;
			
//		case "gender":
//			String gender = 성별 % 2 == 1 ? "남성" : "여성";
//			ret = name + "님은 " + age + "살이고 ";
//			ret += 성별 + "입니다.";
//			break;
			
		default:
			ret = info();		// 이미 만들어진 기본형 함수를 다른 메서드에서도 호출한다.
		}

		return ret;
	}

}

public class Quiz1 {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.name = "이지은";
		m1.age = 28;

		Member m2 = new Member();
		m2.name = "홍길동";
		m2.age = 16;

		// 인자값이 없으면 기본형을 반환해라.
		System.out.println(m1.info());
		// 이지은 님은 28살 입니다.

		// 인자값이 있으면 값을 비교해서 해당하는 내용을 추가로 반환해라.
		System.out.println(m2.info("adult"));
		// 홍길동 님은 16살이고 미성년자 입니다.

		System.out.println(m1.info("abcde"));

	}
}
