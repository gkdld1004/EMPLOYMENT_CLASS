package day22_console_chat;

import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		
		Socket so = new Socket("127.0.0.1", 7777);
		
		Send send = new Send(so);
		Recieve recv = new Recieve(so);
		
		Thread th1 = new Thread(send);
		th1.start();
		
		Thread th2 = new Thread(recv);
		th2.start();
				
	}
}
