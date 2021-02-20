package day22_console_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Send implements Runnable {		
	
	// System.in 에서 입력받아서, so.getOutputStream() 으로 보내는 클래스

	Socket so;
	Scanner sc;
	PrintWriter pw;
	
	public Send(Socket so) throws IOException {
		this.so = so;		// 7) 전달받은 소켓을 멤버 필드에 저장
		sc = new Scanner(System.in);					// 내 컴퓨터 키보드로 입력
		pw = new PrintWriter(so.getOutputStream());		// 소켓 대상에게 문자열 보내기
		// 생성이 끝났으면 다시 이전 코드로
	}

	@Override
	public void run() {
		String msg;
		while(true) {
			msg = sc.nextLine();
			if(msg.equals("exit")) break;		// 12) 만약 msg값이 exit이면 반복 종료	
			pw.println(msg);					// 13) 내 컴퓨터 키보드 입력을 msg에 저장
			pw.flush();
		}
		pw.close();
		sc.close();
	}
	
}
