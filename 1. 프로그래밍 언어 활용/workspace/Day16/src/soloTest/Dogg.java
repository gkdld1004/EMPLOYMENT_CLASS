package soloTest;

public class Dogg extends Animall implements Companionn{
	
	public Dogg(String name) {
		super(name);
	}

	@Override
	public String getAjrdl() {
		return "개껌";
	}

	@Override
	public String howTo() {
		return "던져";
	}
}
