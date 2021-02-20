package day19_exception;

class Timer {
	private int second = 5;
	
	public void go() throws InterruptedException {
		for(int i = second; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.printf("[%02d : %02d]\n", i / 60, i % 60);
		}
	}
}

// 현재의 코드에서 try ~ catch 를 사용하지 않고 실행할 수 있도록 변경해보세요.
public class Quiz2 {
	public static void main(String[] args) throws InterruptedException {		// 위험을 안고 가는 코드
									// try ~ catch 사용을 추천 !
		new Timer().go();
		
	}
}
