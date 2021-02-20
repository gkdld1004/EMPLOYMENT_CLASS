package day23_multi;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Server 에서 사용하는 클래스 
// 서버에 접속한 개별의 클라이언트를 각각 스레드로 관리하는 클래스
public class ClientThread implements Runnable {
	
	Socket so;
	Scanner sc;
	PrintWriter pw;

	public ClientThread(Socket so, Scanner sc, PrintWriter pw) {
		this.so = so;
		this.sc = sc;
		this.pw = pw;
	}

	@Override
	public void run() {		// throws 할 수 없음 (부모클래스를 그대로 유지)

		String msg = "";
		while(true) {
			try {
				msg = sc.nextLine();
				if("exit".equals(msg)) {
					break;
				}
				Server.sendMessage(msg);		// 리스트에 들어온 모든 pw 객체에 메시지를 전달
				
			} catch(NoSuchElementException e) {
				Server.plist.remove(pw);
				System.out.println("현재 접속자 수 : " + (Server.plist.size() - 1));
				break;
			} 
		}		// end of while

		sc.close();
		pw.close();
		try { so.close(); } catch(IOException e) {}
	}

}
