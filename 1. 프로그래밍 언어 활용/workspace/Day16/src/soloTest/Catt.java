package soloTest;

public class Catt extends Animall implements Companionn{
	
	public Catt(String name) {
		super(name);
	}

	@Override
	public String getAjrdl() {
		return "생선";
	}

	@Override
	public String howTo() {
		return "던져";
	}
}
