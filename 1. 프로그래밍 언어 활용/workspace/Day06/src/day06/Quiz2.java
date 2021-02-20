package day06;

public class Quiz2 {
	
	static int getMaxInt(int n1, int n2) {		// 연산 처리해서 반환하는 역할
		if(n1 > n2)
			return n1;
		else 
			return n2;
		
//		return n1 > n2 ? n1 : n2;	// 삼항연산 처리 
		
	}
	// getMaxInt. 자바에서 함수 이름은 겹쳐도 가능 
	// 		└> 함수의 본체는 따로 있지만, 이름은 같이 공유하고 있다.  
	//		└> ≒ 메서드 오버로딩 (함수의 중복 정의). 인수의 갯수로 구분
	//				 오버라이딩 : 재정의 (기존 내용 유지 X)
	static int getMaxInt(int n1, int n2, int n3) {
		if((n1 > n2) && (n1 > n3)) {
			return n1;
		}
		else if ((n2 > n3) && (n2 > n1)) {
			return n2;
		}
		else 
			return n3;
		
//		int max = n1; 	// n1이 최대값이라고 가정하고
//		if(max < n2)	// 만약, n2가 최대값보다 더 크면
//			max = n2;	// n2가 최대값이다.
//		if(max < n3)	// 만약, n3가 최대값보다 더 크
//			max = n3;	// n3가 최대값이다.
//		return max;		// 구해진 최대값을 반환한다.
	}
	
	public static void main(String[] args) {	// 출력은 main함수에서 
		
		// 1) 두 정수를 전달받아서 큰 수를 반환하는 함수 getMaxInt
		System.out.println(getMaxInt(3, -5));	// 3
		
		// 2) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수 getMaxInt
		System.out.println(getMaxInt(2, 4, 3));	// 4
		
		// 3) 두 정수를 전달받아서 두 정수 사이의 합계를 반환하는 함수 getSum
		//	    두 정수의 전달 순서에 상관없이 사이의 값을 구할 수 있도록 만들기
		System.out.println(getSum(1, 10));	// 55
		System.out.println(getSum(10, 1));	// 55
	}
	
	static int getSum(int n1, int n2) {
		int sum = 0;
		if(n1 < n2) {
			for(int i = n1 ; i <= n2; i++) {
				sum += i;
			}
		}
		else {
			for(int i = n2 ; i <= n1; i++) {
				sum += i;
			}
		}
		return sum;
		
//		// 두 수 중에 어떤 수가 더 큰 수 인지 먼저 판별
//		int min = n1 < n2 ? n1 : n2;
//		int max = getMaxInt(n1, n2);		// 기존에 만들어 놓은 함수 활용 가능
//		int sum = 0;
//		
//		for(int i = min; i <= max; i++) {
//			sum += i;
//		}
//		return sum;
	
		// 중복되는 코드는 줄일 수 있으면 줄이는게 좋음 ! 
	}
}
