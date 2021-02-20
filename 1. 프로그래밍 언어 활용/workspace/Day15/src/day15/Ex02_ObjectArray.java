package day15;

import java.util.Scanner;

class Human {
	String name;
	Human(String name){
		this.name = name;
	}
}

class Student extends Human {
	int score;
	Student(String name, int score){
		super(name);
		this.score = score;
	}
	public void show() {
		System.out.println(name + " : " + score);
	}
}

public class Ex02_ObjectArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human ob1 = new Human("이지은");
		Student st1 = new Student("문동욱", 100);
		st1.show();
		
		Human st2 = st1; // 업캐스팅 가능
		
		Human[] arr1 = { ob1, st1, st2 };
		
		Object obj = sc;	// sc 객체를 Object 형태로 업캐스팅
		
		Object[] arr2 = { ob1, st1, st2, sc, obj };	
		// Scanner 는 Human 클래스와 아무 상관이 없어보이지만, 
		// 똑같이 Object 클래스의 하위 클래스이므로, 같은 배열에 묶어서 처리할 수 있다.
 	}
}
