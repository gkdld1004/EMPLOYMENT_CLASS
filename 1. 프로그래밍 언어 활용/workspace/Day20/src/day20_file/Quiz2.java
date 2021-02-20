//package day20_file;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Timer extends Thread {
//	private double second;
//	private boolean isOver;
//	
//	public Timer(double second) {
//		this.second = second;
//	}
//	
//	public void run() {
//		go();
//	}
//	
//	public void go() {
//		for(int i = (int)second; i >= 0; i--) {
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {}
//			System.out.printf("[%02d : %02d]\n", i/60, i%60);
//		}
//		System.out.println();
//		setOver(true);
//	}
//
//	public boolean isOver() {
//		return isOver;
//	}
//
//	public void setOver(boolean isOver) {
//		this.isOver = isOver;
//	}
//	
//}
//
//class Input {
//	
//	private ArrayList<String> list = new ArrayList<String>();
//	private Scanner sc = new Scanner(System.in);
//	private Timer t;
//	
//	public Input(Timer t) {
//		this.t = t;
//	}
//	
//	public void go() {
//		while(true) {
//			System.out.print("입력 : ");
//			String text = sc.nextLine();
//			list.add(text);
//			if(t.isOver() == true) {
//				break;
//			}
//		}
//		System.out.println("==== 입력 종료 ====\n");
//		
//		for(String text : list) {
//			System.out.println(text);
//		}
//	}
//
//	public ArrayList<String> getList() {
//		return list;
//	}
//
//	public void setList(ArrayList<String> list) {
//		this.list = list;
//	}
//	
//}
//
//public class Quiz2 {
//	
//	// 사용자에게 10초간 문자열을 입력받으세요.
//	// 엔터를 치면 다음 내용은 다음 줄에 작성되어야 합니다.
//	// 10초가 지나면 지금까지 입력받은 문자열을
//	// C:\JavaFileTest\quiz2.txt 에 기록하세요.
//	// 맨 아래에는 작성날짜와 시간을 yyyy-MM-dd hh:mm:ss 의 형식으로 넣어주시고
//	// 작성자 본인의 이름을 기록해주세요.
//	// 파일 기록이 끝나면 Runtime을 이용하여 메모장을 실행하시면 됩니다.
//	
//	// 키보드 입력 -> 프로그램 -> 파일 출력
//	// \n, 윈도우 메모장은 \r\n 이 같이 있어야 줄바꿈으로 인식합니다.
//	
//	
//	public static void main(String[] args) throws IOException {
//		
//		Timer t = new Timer(10);
//		Input input = new Input(t);
//		
//		t.start();
//		input.go();
//		
//		File f = new File("C:\\JavaFileTest", "quiz2.txt");
//		FileOutputStream fos = new FileOutputStream(f);
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		if(f.exists() == false) {
//			f.createNewFile();
//		}
//		
//		for(int i = 0; i < input.; i++) {
//			
//		}
//		
//	}
//}
