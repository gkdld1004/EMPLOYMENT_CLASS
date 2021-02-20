package soloTest;

public class Testt {
	public static void main(String[] args) {
		
		Humann h1 = new Humann("천송이");
		
		Catt c1 = new Catt("꿀벌");
		Dogg d1 = new Dogg("송이");
		
		Friendd f1 = new Friendd("만송이");
		
		h1.give(c1);	
		h1.give(d1);	
		h1.give(f1);	
		
	}
}
