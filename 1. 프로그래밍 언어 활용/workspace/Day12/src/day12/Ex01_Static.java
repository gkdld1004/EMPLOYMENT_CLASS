package day12;

/*
 * static 필드/메서드의 주 용도 !
 * 
 * 1) 객체를 생성하지 않아도 메서드를 호출할 수 있다. (main 함수)
 * 2) 여러 객체를 생성할 때, 각 객체가 서로 공유하는 특징을 저장할 필드로 설정할 수 있다.
 * 
 * */

class Member{
	String name;
	int age;
	static int num;		// 각각의 객체에 소속되지 않고, Member 클래스에 속하는 데이터
	static int aLL;		// 객체가 총 몇개 생성되었는지 확인하는 필드
	// static 요소는 이클립스에서 기울움체로 표현된다.
	
	Member(String name, int age){		// 객체가 생성될 때마다 호출되는 메서드
		this.name = name;
		this.age = age;
		System.out.println(name + " 객체 생성 !!");	
		aLL += 1;		// 객체가 생성될 때 마다 all의 값을 1 증가시킨다. (기본값은 0)
	}
	
	public void ShowInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살\n");
	}
	
	void printAll() {
		System.out.println("생성된 총 객체 수 : " + aLL + "\n");
	}
	
//	static void printName() {
//		System.out.println("이름은 " + name + " 입니다.");
//		The static field Member.aLL should be accessed in a static way
//	}
}

public class Ex01_Static {
	public static void main(String[] args) {
		
		System.out.println(Member.aLL);		// 객체가 생성되지 않아도 값에 접근할 수 있다.
											// 객체에 소속되지 않으니까
		
		Member ob1 = new Member("이지은", 28);
		System.out.println(ob1.aLL);		// 객체를 통해서 접근해도 되지만, 의미상 클래스.필드로 접근
//		The static field Member.aLL should be accessed in a static way
		
		Member ob2 = new Member("민경훈", 35);
		System.out.println(Member.aLL);
		
//		ob1.num = 10;
//		System.out.println("ob1.num : " + ob1.num);
//		
//		ob2.num = 20;		// ob2를 통해서 값을 대입
//		System.out.println("ob1.num : " + ob1.num);		// ob1을 통해서 값을 참조하여 출력

		
		ob1.ShowInfo();
		ob2.ShowInfo();
	}
}
