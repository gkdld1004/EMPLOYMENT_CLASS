package day12;

public class Card {
	char kind;
	int num;
	static int width;
	static int height;
	String p;

	Card(int width, char kind, int num) {
		this.kind = kind;
		this.num = num;
		this.width = width;
		this.height = width;
		if (kind == 'H')
			p = "♥";
		else if (kind == 'S')
			p = "♠";
		else if (kind == 'C')
			p = "♣"; // 다이아는 형태 깨져서 안만듬
	}

	void show() {
		System.out.println("[" + kind + num + " CARD]");
		for (int i = 0; i < height; i++) {
			if (i == 0)
				System.out.print("┌");
			else if (i == height - 1)
				System.out.print("└");
			else
				System.out.print("│");// 줄의 가장 왼쪽

			if (i == 0 || i == height - 1) // 줄의 가운데 부분 출력
				for (int j = 0; j < width; j++)
					System.out.print("─");
			else {
				for (int j = 0; j < width; j++) {
					if (j == width / 2 && (i >= height / 2 - num / 2 && i <= height / 2 + num / 2)) {
						if (num % 2 == 0 && i == height / 2)
							System.out.print(" ");
						else
							System.out.print(p);
					} else
						System.out.print(" ");
				}
			}

			if (i == 0)
				System.out.print("┐");
			else if (i == height - 1)
				System.out.print("┘");
			else
				System.out.print("│");
			System.out.println();
		}
	}

	static void setSize(int size) {
		width = size;
		height = size;
	}
	
	// 1) 클래스.메서드() 형식은 static메서드에 접근하는 문법이므로 
	// 		setSize메서드를 static 속성으로 변경한다.
	
	// 2) static method setSize는 객체 필드 width, height에 접근할 수 없다.
	//		생성 시점이 서로 다르기 때문에 (static 요소가 더 먼저 생성되고, 그 시점에는 객체 필드가 없을 수도 있다.)
}
