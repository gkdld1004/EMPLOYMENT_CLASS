package day10;

class Square {
	int size;					// 크기를 저장할 멤버 필드
	char ch= '*';				// 출력할 글자를 받는 필드
	
	Square(int size){			// 객체 생성시 크기를 전달받을 생성자
		this.size = size;
	}
	Square(int size, char ch){
		this.size = size;
		this.ch = ch;
	}
	// 기본 생성자가 작성되지 않았으므로, 크기를 전달하지 않으면 객체를 생성할 수 없다 !!
	
	void show() {				// 크기에 따라 사각형을 출력하는 메서드
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				boolean flag = i == 0 || j == 0 || i == size - 1 || j == size -1;
				if(flag) {
					System.out.print(ch + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Ex06 {
	public static void main(String[] args) {
		
		Square ob1 = new Square(5);
		ob1.show();
		
		Square ob2 = new Square(4);
		ob2.show();

		Square ob3 = new Square(5, '$');
		ob3.show();
		
		
	}
}
