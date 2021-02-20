package soloTest;

public class Humann {
	private String name;

	public Humann(String name) {
		this.name = name;
	}
	
	void give(Companionn a) {
		
		System.out.println(name + "가 " + a.getName() + "에게 " + 
		a.getAjrdl() + "을 " + a.howTo() + " 주었다.");
	}
	
	public String getName() {
		return name;
	}
	
}
