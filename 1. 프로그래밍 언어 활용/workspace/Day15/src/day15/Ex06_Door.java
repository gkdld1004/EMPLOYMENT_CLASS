package day15;

abstract class Door {
	void close() {		// 추상클래스도 일반메서드를 포함할 수 있다.
		System.out.println("문을 닫는다.");
	}
	
	abstract void open();
}

class PushDoor extends Door {
	
	@Override
	void open() {
		System.out.println("문을 밀어서 연다.");
	}
}

class AutoDoor extends Door {
	
	@Override 
	void open() {
		System.out.println("문 앞에 서면 자동으로 열린다.");
	}
}

public class Ex06_Door {
	public static void main(String[] args) {
		
		PushDoor ob1 = new PushDoor();
		AutoDoor ob2 = new AutoDoor();
		
		ob1.open();
		ob2.open();
		
		// 추상클래스를 상속받은 익명의 클래스를 만들고, 객체를 생성하기
		
		Door ob3 = new Door() {
			@Override
			void open() {
				System.out.println("버튼을 누르면 문이 열립니다.");
			}
		};
		
		ob3.open();
		
		System.out.println();
		System.out.println(ob1.getClass());
		System.out.println(ob2.getClass());
		System.out.println(ob3.getClass());		// class day15.Ex06_Door$1 : $ 익명클래스
		
		Door[] arr = new Door[] { ob1, ob2, ob3 };
		// 부모형식 배열에 담으면 up-casting
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getClass() + " : ");
			arr[i].open();
			arr[i].close();
		}
		
		// 추상클래스는 객체를 생성할 수 없다.
		// 하지만 다른 클래스가 추상클래스가 상속받아서 상속받은 메서드가 바디를 받아주면 그 객체를 생성할 수 있다.
	}
}
