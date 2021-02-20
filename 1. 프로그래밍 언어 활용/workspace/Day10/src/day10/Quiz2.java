package day10;

class Item {
	String name;	 // ①
	int price;

	void show() {
		System.out.printf("%s : %,d원\n", name, price); // %,d : 천단위 구분
	}

	// 생성자			 // ②
	Item() {
		name = "이름없음";
	}

	Item(String name) {
		this.name = name; // 각각의 객체가 서로 다른 이름을 가지게 할 경우
		price = 249000;
	}

	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		
		Item it1 = new Item();
		Item it2 = new Item("24인치 모니터");
		Item it3 = new Item("55인치 TV", 1490000);
		
		it1.show();		// 이름없음 : 0원
		it2.show();		// 24인치 모니터 : 249,000원
		it3.show();		// 55인치 TV : 1,490,000원
		
	}
}
