package day20_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_Directory {
	public static void main(String[] args) throws Exception {
		
		String dirName = "C:\\JavaFileTest";
		
		File dir1 = new File(dirName);		// 폴더의 정보가 담겨있다.
		if(dir1.exists() == false) {
			dir1.mkdirs();
		}
		
		Runtime rt = Runtime.getRuntime();

		if(dir1.exists() == true) {
			rt.exec("explorer C:\\");		// explorer 는 탐색기를 실행하는 윈도우 명령어
		}
		
		File f1 = new File(dir1, "profile.text");				// 파일
		FileOutputStream fos = new FileOutputStream(f1);		// 파일에 데이터를 보내는 통로
		OutputStreamWriter osw = new OutputStreamWriter(fos);	// 통로에 문자열을 전송하는 객체
		BufferedWriter bw = new BufferedWriter(osw);			// 문자열을 버퍼 단위로 기록하는 객체
		
		if(f1.exists() == false) {
			f1.createNewFile();
		}
		
		String context = "이름 : 이지은 \r\n나이 : 28\r\n";
		context += new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		bw.write(context);		// 문자열을 버퍼에 기록
		bw.flush();				// 버퍼를 비운다. -> 파일에 보낸다.
		bw.close();				// 스트림(통로)을 닫는다.
		
		rt.exec("notepad " + f1.getAbsolutePath());
		
		Object ob = new Object();
		bw.write(ob.toString());		// 클래스에서 toString() 을 오버라이드 하면
										// 문자열 형식으로 기록할 때에도 사용할 수 있다.
										// show()로 하면 출력만 되겠지만,
										// 오버라이드하면 출력에도 쓸 수 있고, 파일 기록에도 사용할 수 있다. 
		
	}
}
