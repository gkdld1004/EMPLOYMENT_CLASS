package day06;

public class Quiz1 {
	
	static int reverse(int num) {	// 반드시 하나의 정수값을 return 해야 한다.

		int tmp = 0;
		while(true) {
			tmp += num % 10;
			tmp *= 10;
			num /= 10;
			if(num < 10) {
				tmp += num;
				break;
			}
		}
		return tmp;
		
//		int ret = 0;
//		while(num >0) {
//			ret += num % 10;
//			ret *= 10;
//			num /= 10;
//		}
//		return ret /10;
	}
	
	static double getObesityRate(double n1, double n2) {	// 자바에서는 밑에 있어도 됨
		return (n2 / (n1 - 100) * 0.9) * 100;
	}
	
	public static void main(String[] args) {
		
		int num = 1234;
		int ret = reverse(num);
		
		System.out.println(reverse(13579));
		
		System.out.println(num + "을 뒤집으면 " + ret +"이다.");
		
		
		// 키와 체중을 실수 형태로 전달받아서, 비만도를 반환하는 함수를 만들자.
		// (현재 체중 / (키 - 100) * 0.9) * 100
		
		double rate = getObesityRate(171.25, 65.54);
		System.out.printf("\"%.2f%%\"" ,rate);
		
	}
}
