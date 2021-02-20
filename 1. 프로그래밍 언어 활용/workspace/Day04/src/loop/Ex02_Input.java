package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02_Input {
	public static void main(String[] args) throws IOException {
		
		// 1byte 단위로 입력받을 수 있는 객체
		
		// System.in	: 시스템 입력. 키보드에 의한 입력이 버퍼를 지나서 프로그램으로 들어옴
		// System.out	: 시스템 출력. 프로그램 -> 표준 출력 스트림 -> 화면 (Console)
		// System.err	: 시스템 에러. 프로그램 -> 에러 출력 스트림 -> 화면 (Console)
		
		System.out.println("1byte의 키 값 입력 : ");
		int a = System.in.read();	// 입력받은 키의 아스키 코드값을 정수로 반환
		int b = System.in.read();	// \r. 13, Carrige Return
		int c = System.in.read();	// \n. 10, Line Feed
		// 13(\r : 가장 왼편으로 이동) , 10(\n : 한 줄 밑으로 내리는 역할): Enter키 
		
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);	
		
		
		// 2Byte 단위로 입력받을 수 있는 객체
		
		InputStreamReader ins = new InputStreamReader(System.in);
		System.out.println("2 byte 글자 입력 :");
		char ch1 = (char)ins.read();
		
		System.out.println("ch1 : " + ch1);
		
		// 문자열 단위로 입력받는 객체
		
//		BufferedReader br = new bufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(ins);
		br.readLine();	// sc.nextLine() : 엔터키를 입력한 이전까지 내용을 문자열로
		
		System.out.print("안녕하세요 라고 입력해보세요 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		
		// 예외처리 내장 및 간편화, 기능 추가
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();	// 버퍼에서 정수만 가져온다. (\r, \r은 정수가 아니므로 버퍼에 남는다.
		sc.nextDouble();
		sc.next();
		sc.nextShort();
		sc.nextByte();
		sc.nextBoolean();
		sc.nextLine();
		sc.nextLine().charAt(0);
		
		sc.close();
	}
}

