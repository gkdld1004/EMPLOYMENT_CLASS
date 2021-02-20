package day22_console_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Recieve implements Runnable {
	
	// so.getInputStream()으로 데이터를 전달받아서 내 컴퓨터의  System.out으로 출력하는 클래스
	Socket so;
	Scanner sc;
	PrintWriter pw;
	
	public Recieve(Socket so) throws IOException{
		this.so = so;		// 9) 전달받은 소켓을 멤버 필드에 저장 (다른 메서드에서 사용하기 위함)
		sc = new Scanner(so.getInputStream());		// 대상의 입력을 받아올 객체
		pw = new PrintWriter(System.out);		// 내 컴퓨에 출력할 객체
	}
	
	@Override
	public void run() {
		String msg;
		while(true) {
			msg = sc.nextLine();
			if(msg.equals("exit")) break;
			pw.println(msg);
			pw.flush();		// 보내기만 하고 flush 안하면 메시지가 전송 안됨
		}
		pw.close();
		sc.close();
	}
}
