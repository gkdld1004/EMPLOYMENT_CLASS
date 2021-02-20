package day22_console_chat;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss;		// 1) 서버 소켓 참조변수 생성
		Socket so;				// 2) 클라이언트의 소켓을 저장할 참조변수 생성
		
		ss = new ServerSocket(7777);					// 3) 7777 포트를 사용할 서버소켓 객체 생성
		System.out.println("7777 포트 접속 대기중...");		// 4) 대기 메시지 출력
		so = ss.accept();								// 5) 클라이언트가 접속하면 클라이언트의 정보를 소켓으로 저장
		
		Send send = new Send(so);			// 6) Send 객체 생성
		Recieve recv = new Recieve(so);		// 8) Recieve 객체 생성
		
		Thread th1 = new Thread(send);		// 10) send 객체를 Thread화 해석
		th1.start();						// 11) start() 호출 == run() 실행
		
		Thread th2 = new Thread(recv);
		th2.start();
		
	}
}
