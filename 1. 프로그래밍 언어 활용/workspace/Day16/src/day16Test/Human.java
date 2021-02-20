package day16Test;

public class Human {

	protected String name;

	public Human(String name) {
		this.name = name;
	}

//	void give(Animal a) {
	void give(Companion a) {	// 같이 살 수 잇는 객체를 전달받는다.
//
//		String feed = "식량";
//
//		// 1) 클래스의 이름을 문자열로 단순화해서 그 값에 따라서 먹이를 결정하기
//		switch (a.getClass().getSimpleName()) {
//		case "Cat":feed = "생선";break;
//		case "Dog":feed = "개껌"; break;
//		case "Friend":feed = "치킨"; break;
//		}
//		
//		// 2) instanceof 연산자를 활용하여 객체의 자료형을 판별하고 그에 따라 먹이를 결정하기
//		if(a instanceof Cat)
//			feed = "생선";
//		if(a instanceof Dog)
//			feed = "개껌";
//		if(a instanceof Friend)
//			feed = "치킨";
		
		System.out.print(name + "이 " + a.getName() + "에게 ");
		System.out.println(a.getFeed() + "을 " + a.howTo() + " 주었다.");

	}
	
	public String getName() {
		return name;
	}
}

