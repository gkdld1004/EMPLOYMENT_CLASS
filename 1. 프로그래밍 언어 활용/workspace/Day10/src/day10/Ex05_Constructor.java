package day10;

class Pos {
	// member field
	int x;
	int y;
	
	// member method
	void showPos() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println();
	}
	
	// constructor (생성자) : 반환형이 없다. 클래스의 이름과 동일한 이름을 사용하는 함수이다.
	Pos(){
		System.out.println("기본 생성자 호출 !!");
	}
	
	Pos(int x, int y){		// 생성자는 함수, 메서드
		// 매개변수도 지역변수로 취급한다.
		this.x = x;		// 외부에서 전달받은 x의 값을 멤버필드 x에 대입해라.
		this.y = y;		// 지역변수와 멤버필드의 이름이 같을 때 구분하기 위해서 사용
	}
	
	// 1. 생성자를 아예 작성하지 않으면, 매개변수 없는 기본생성자가 자동으로 만들어진다.
	// 2. 어떤 형식이든 생성자를 직접 작성하면, 기본생성자가 자동으로 만들어지지 않는다.
}

public class Ex05_Constructor {
	public static void main(String[] args) {
		
		Pos ob1 = new Pos();
		Pos ob2 = new Pos(3, 7);
		ob1.showPos();
		ob2.showPos();
				
	}
}
