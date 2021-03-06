package day20_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex05 {
	static void fileWrite(ArrayList<Member> list) throws IOException {

		// 각 객체의 정보를 C:\JavaFileTest\ex05.txt 파일에 기록하기
		// toString() 를 오버라이드 하면 편리하게 작업할 수 있다. (각각의  getter를 따로 기록하기보다, 한번에 기록이 편하니까)
		// for문으로 각 리스트에 있는 객체를 대상으로 작업하자.
		// file 객체에 기록할 때, bw.write("String") 메서드는 덮어쓰기
		// file 객체에 기록할 때, bw.append("String") 메서드는 내용을 아래에 덧붙이기

		File f = new File("C:\\JavaFileTest", "ex05.txt");
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		if(f.exists() == false) {
			f.createNewFile();
		}
		bw.write("번호\t이름\t성별\t전화번호\r\n");
		bw.write("========================================\r\n");
		
		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
			String format = String.format("%d\t%s\r\n", i + 1, list.get(i).toString());
			bw.write(format); 	// 리스트의 각 객체를 반복하여 파일에 기록한다.
		}
		bw.flush();
		bw.close();
		
		Runtime.getRuntime().exec("notepad " + f.getAbsolutePath());
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Member> list = new ArrayList<Member>();

		Member m1 = new Member("이지은", "여성", "010-1234-1234");
		Member m2 = new Member("홍진호", "남성", "010-2222-2222");
		Member m3 = new Member("홍길동", "남성", "010-3333-3333");

		list.add(m1);
		list.add(m2);
		list.add(m3);

		fileWrite(list);
		
	}
}
