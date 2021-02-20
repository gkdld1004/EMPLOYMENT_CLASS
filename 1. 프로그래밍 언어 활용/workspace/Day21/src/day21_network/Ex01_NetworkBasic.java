package day21_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01_NetworkBasic {
	public static void main(String[] args) {
		
		InetAddress inet1 = null;
		InetAddress inet2 = null;
		
		try {
			
			inet1 = InetAddress.getByName("lol.inven.co.kr");		// Domain Name
			// comic.naver.com	
			// translate.google.com
			System.out.println("<inet1>");
			System.out.println("getLocalHost : " + InetAddress.getLocalHost());
			System.out.println("getHostName : " + inet1.getHostName());
			System.out.println("getHostAddress : " + inet1.getHostAddress());
			System.out.println("getCanonicalHostName : " + inet1.getCanonicalHostName());
			
			byte[] addr = { (byte)125, (byte)209, (byte)222, (byte)141 };
			// 125.209.222.141
			
			inet2 = InetAddress.getByAddress(addr);		// IP Address 
			System.out.println("<inet2>");
			System.out.println("getLocalHost : " + InetAddress.getLocalHost());
			System.out.println("getHostName : " + inet2.getHostName());
			System.out.println("getHostAddress : " + inet2.getHostAddress());
			System.out.println("getCanonicalHostName : " + inet2.getCanonicalHostName());
			
		} catch(UnknownHostException e) {
			System.out.println("호스트를 알 수 없습니다 : " + e);
		}
	}
}
