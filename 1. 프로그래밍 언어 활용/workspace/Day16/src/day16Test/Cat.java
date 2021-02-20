package day16Test;

// 동물의 특징을 물려받은 고양이 (같이 살 수 있는)
public class Cat extends Animal implements Companion{
	
	private final String feed = "생선";
	private final String howto = "던져";
	
	Cat(String name){
		super(name);
	}

	@Override
	public String getFeed() {
		return feed;
	}

	@Override
	public String howTo() {
		return howto;
	}
	
//	@Override 
//	public String getName() {
//		return name;
//	}
	// Animal로 부터 상속을 이미 받고 있음 ~
}
