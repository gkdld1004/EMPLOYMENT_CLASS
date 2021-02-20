package typeTest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:type.xml");
		
		PrimitiveType ob1 = ctx.getBean("typeTest", PrimitiveType.class);
		ob1.showAll();
		
		ListType ob2 = ctx.getBean("t2", ListType.class);
		ob2.showList();
		
		MapType ob3 = ctx.getBean("t3", MapType.class);
		ob3.showMap();
		
		ctx.close();
		
	}
	
}
