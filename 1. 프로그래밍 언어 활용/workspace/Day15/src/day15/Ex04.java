package day15;

// 같은 패키지 내에 있는 Student 클래스를 참조하여 객체를 생성

class MyStudent extends Student {
	
	MyStudent(String name, int score){
		super(name, score);
	}
	
	@Override
	public boolean equals(Object obj) {
		MyStudent ref = null;
		
		boolean flag1 = obj instanceof MyStudent;	
		// instanceof : 객체의 데이터 타입을 확인하기 위해 사용하는 연산자.
		// A instanceof B : A 객체가 B 클래스로 생성된 객체인지 판단하여 true / false 를 나타냄.
		
		if(flag1) 
			ref = (MyStudent)obj;	
		else
			return false;
		boolean flag2 = ref.name.equals(this.name);
		boolean flag3 = ref.score == this.score;
		
//		if(flag2 && flag3)
//			return true;
//		else 
//			return false;
		
		return flag2 && flag3;
	
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		
		MyStudent st1 = new MyStudent("이지은", 100);
		MyStudent st2 = new MyStudent("문동욱", 100);
		MyStudent st3 = new MyStudent("이지은", 100);
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));	// 메모리 주소가 달라서 false
	}
}
