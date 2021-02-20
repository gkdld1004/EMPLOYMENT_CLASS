package dependency2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:appCtx2.xml");
		
		Toy toy1 = ctx.getBean(Toy.class);		// 자료형만 비교해서 객체를 가져올 수도 있다
												// 특정 자료형의 객체가 스프링 컨테이너에 하나만 있어야 한다
		
		System.out.println(toy1.getBattery());
		System.out.println();
		
		toy1.run();
		
		Toy toy2 = new Toy();
		toy2.run();
		
		System.out.println("====================================");
		
		Clock c1 = ctx.getBean(Clock.class);
		c1.run();
		
		
		ctx.close();
		
	}
}
