package day16Test;

// 2) Cat 과 Dog의 슈퍼 클래스 Animal, 각각의 클래스가 가지는 공통 속성(필드)과 기능(메서드)를 묶어서 관리한다.
public class Animal {
	protected String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
