package day10;

class Circle {
	// 필드
	double radius;
	double circum, area;
	
	// 생성자	: 생성자 간의 호출은 가능하지만, 각 생성자의 첫번째 줄에서만 호출할 수 있다.
	// 생성자 내부에서는 다른 생성자의 이름으로 호출할 수 없고, this()의 형식으로 호출한다.
	
	Circle(){
		this(5.0);
	}
	
	Circle(int radius){		// 대입연산자는 좌변과 우변의 자료형이 같아야 한다.
		this((double)radius);
		// 크기, 범위, 데이터의 호환 여부에 따라 암묵적 형 변환 (promotion)
	}
	
	Circle(double radius){		// 생성자 간의 공통의 코드를 가지고 있는 생성자.
		this.radius = radius;
		circum =2 * radius * Math.PI; 			// Math.PI : π (원주율)
		area = Math.sqrt(radius) * 3.14;		// Math.pow(x, y) : x의 y승
		System.out.println("없어도, 정수여도, 실수여도 내가 다 처리한다.");
	}
	
	// 메서드
	void show() {
 		System.out.printf("둘레 : %.2fcm, 넓이 : %.2fcm²\n", circum, area);
	}
}

	/*
	 * 자바스크립트 Math 객체 사용 소스 코드 예제

	Math.pow(2,53) // => 9007199254740992: 2 의 53 승
	Math.round(.6) // => 1.0: 반올림
	Math.ceil(.6) // => 1.0: 올림
	Math.floor(.6) // => 0.0: 내림
	Math.abs(-5) // => 5: 절대값
	Math.max(x,y,z) // 가장 큰 인자를 반환한다.
	Math.min(x,y,z) // 가장 작은 인자를 반환한다.
	Math.random() // 0 과 1.0 사이의 임의의 수를 반환한다.
	Math.PI // π: 원주율
	Math.E // e: 자연 로그 상수
	Math.sqrt(3) // 3 의 제곱근
	Math.pow(3, 1/3) // 3 의 세제곱
	Math.sin(0) // 삼각함수 sin : also Math.cos, Math.atan, etc.
	Math.log(10) // 자연로그 10
	Math.log(100)/Math.LN10 // 밑이 10 인 로그 100
	Math.log(512)/Math.LN2 // 밑이 2 로그 512
	Math.exp(3) // Math.E 의 3 거듭제곱
	
	 */


public class Quiz3 {
	public static void main(String[] args) {
		
		// 원의 넓이와 둘레를 출력할 수 있는 클래스를 작성하려고 한다.
		// 생성자 매개변수에 반지름을 전달하지 않으면 기본값 5
		// 정수를 전달받으면 실수로 변환해서 계산하고
		// 실수는 그대로 전달받아서 처리한다.
		// 둘레 : %.2f cm, 넓이 : %.2f cm²		// ㅊ 한자 
		
		Circle ob1 = new Circle();
		Circle ob2 = new Circle(3);
		Circle ob3 = new Circle(2.2);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
	}
}
