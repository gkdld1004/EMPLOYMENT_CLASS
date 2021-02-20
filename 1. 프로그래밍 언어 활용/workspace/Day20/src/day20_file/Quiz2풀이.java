package day20_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Timer implements Runnable {
	private boolean over;

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.over = true;
	}

	public boolean isOver() {
		return over;
	}
}

public class Quiz2풀이 {
	// 사용자에게 10초간 문자열을 입력받으세요
	// 엔터를 치면 다음 내용은 다음줄에 작성되어야 합니다
	// 10초가 지나면 지금까지 입력받은 문자열을
	// C:\JavaFileTest\quiz2.txt 에 기록하세요
	// 맨 아래에는 작성날짜와 시간을 yyyy-MM-dd hh:mm:ss 의 형식으로 넣어주시고
	// 작성자 본인의 이름을 기록해주세요
	// 파일 기록이 끝나면 Runtime을 이용하여 메모장을 실행하시면 됩니다

	// 키보드 입력 -> 프로그램 -> 파일 출력
	// \n, 윈도우 메모장은 \r\n 이 같이 있어야 줄바꿈으로 인식합니다

	public static void main(String[] args) throws IOException {
		Timer t = new Timer();
		Thread timer = new Thread(t);
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String filePath = "C:\\JavaFileTest";
		String fileName = "quiz2.txt";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss");
		File f = new File(filePath, fileName);
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		// 추가코드
		if (f.exists() == true) { // 기존 파일이 존재하면
			f.delete(); // 파일을 삭제하고
			f.createNewFile(); // 새로운 파일을 생성한 이후
		} // 절대 C:\windows 폴더 내부의 파일을 대상으로 삭제를 수행하지 말 것 !!

		timer.start();

		while (t.isOver() == false) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			list.add(str);
		}

		for (String str : list) {
			bw.write(str + "\r\n");
		}

		bw.write(sdf.format(date) + "\r\n");
		bw.write("\r\n작성자 : 박윤환\r\n");

		bw.flush();
		bw.close();
		String cmd = "notepad " + f.getAbsolutePath();
		Runtime.getRuntime().exec(cmd);
//		cmd에 이런 명령어도 넣어서 실행해보세요
//		"chrome http://www.naver.com" or "start chrome http://www.naver.com"
//		"shutdown /s /f /t 60"		60초 뒤에 컴퓨터가 종료됩니다

		sc.close();

//		1) 저장할 때 마다, 현재 날짜와 시간에 근거하여, 파일이름을 지정한다면 어떨까?
//		2) 만약 저장하려는 이름과 동일한 파일이 이미 있다면 파일 이름 뒤에 (1), (2) 의 형식으로 구분할 수 있는가
//		3) throws 되어 있는 코드를 모두 try ~ catch 로 바꾼다면 어떻게 코드가 변할까

	}
}
