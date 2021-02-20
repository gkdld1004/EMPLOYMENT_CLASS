package day16Test;

public class Dog extends Animal implements Companion{
	
	private final String feed = "개껌";
	private final String howto = "던져";
	
	Dog(String name){
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

}
