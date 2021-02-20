package day16Test;

// 1. 클래스의 생성자, 메서드, 매개변수
// 2. Cat과 Dog의 공통 슈퍼클래스 Animal을 작성하세요.(생성자처리)
//		Human의 서로 다른 give()를 하나로 묶어서 처리하게 변경하세요.
// 3. give() 메서드에서, 대상의 형태에 따라 서로 다른 먹이를 주는 코드로 변경하세요. (instanceof)
//		instaceof를 활용 다운캐스팅
// 4. Human 클래스를 상속받는 클래스 Friend 를 작성하세요.
//		interface Companion을 작성하세요
//		give() 메서드가 Friend 도 같이 처리할 수 있게 변경하세요. (interface 활용)
// 5. give() 에 전달할 수 있는 객체가 모두 Companion으로 처리된다면
//		각각의 Companion이 자신의 음식을 나타내는 getFeed() 함수를 가지게 처리하세요.
//		인터페이스에 의해서 받는 음식의 종류와 건내주는 방식 howTo() 를 작성하세요.

public class Test {
	public static void main(String[] args) {
		
		Human h1 = new Human("도민준");
		
		Cat c1 = new Cat("나비");
		Dog d1 = new Dog("초코");
		
		Friend f1 = new Friend("김신");
		
		h1.give(c1);		// 도민준이 나비에게 생선을 던져 주었다.
		h1.give(d1);		// 도민준이 초코에게 개껌을 던져 주었다.
		h1.give(f1);		// 도민준이 김신에게 치킨을 건네 주었다.		
	}
}
