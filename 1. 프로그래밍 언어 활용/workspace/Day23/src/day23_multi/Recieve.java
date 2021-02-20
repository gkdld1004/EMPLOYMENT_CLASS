package day23_multi;

import java.io.IOException;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Client 에서 사용하는 클래스
// 서버가 보내준 메시지를 스레드로 내 화면에 출력하는 클래스
public class Recieve implements Runnable {

	Scanner sc;
	String msg;
	Socket so;
	
	public Recieve(Socket so) {		// 생성자
		this.so = so;
		try {
			sc = new Scanner(so.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				msg = sc.nextLine();
				if(msg == null) break;
				System.out.println(msg);
			}
		} catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException : Recieve 종료");
		} finally {
			sc.close();
			try { if(so != null) so.close(); } catch(Exception e) {}
		}
	}

}
