package day21_network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Quiz1_Download {
	// 사용자에게 URL 경로를 직접 입력받아서
	// 원하는 파일을 현재 위치에 다운로드 하는 프로그램을 작성하세요
	// 파일의 크기, 파일 이름, 타입, 다운로드 진행상황을 보여줘야 합니다.
	
	// http://221.164.9.222/img/iu.jpg
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("URL 경로 입력 : ");
		String urlstr = sc.nextLine();
		URL url = new URL(urlstr);
		String downloadName = url.getFile().replace("/", "");
		
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		FileOutputStream fos = new FileOutputStream(downloadName);
		
		byte[] ba = new byte[1024];
		int n = 0;
		int count = 0;
		
		URLConnection uc = url.openConnection();
		int fileSize = uc.getContentLength();
		
		while((n = bis.read(ba)) != -1) {
			fos.write(ba, 0, n);
			count += n;
			fos.flush();
			System.out.println(count * 100 / fileSize + " %");
		}
		System.out.println("파일 크기 : " + fileSize);
		System.out.println("컨텐트 타입 : " + uc.getContentType());
		
		fos.close();
		bis.close();
		is.close();
		sc.close();
	}
}
