package day16Test;

public class Friend extends Human implements Companion{
	
	private final String feed = "치킨";
	private final String howto = "건네";
	
	public Friend (String name){
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
