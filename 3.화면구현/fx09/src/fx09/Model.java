 package fx09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	// MemberVO 여러 객체를 묶어서 관리할 수 있는 컬렉션이 필요하고
	ObservableList<MemberVO> list = FXCollections.observableArrayList(

//				new MemberVO("이지은", "010-1234-1234"),	// String을 전달하여 객체를 생성하지만
//				new MemberVO("홍진호", "010-2222-2222"),	// SimpleStringProperty 속성을 가지게 된다
//				new MemberVO("고은아", "010-3131-3131")	// TableView에서 표현할 수 있는 자료형이 된다
				
			);	// 테이블에 나타나는 리스트

	// MemberVO 를 추가/삭제 할 수 있는 메서드가 필요하다		(CRUD : 생성, 읽기, 수정, 삭제)

	public void addMember(MemberVO newData) {	// 생성
		list.add(newData);
	}

	public void deleteMember(int index) {		// 삭제
		list.remove(index);
	}
	
	// Model 이 가지는 데이터는 휘발성 메모리(RAM)에 존재하므로, 영속성을 부여하기 위해서 파일이나, DB에 저장해야 한다
	// 저장 및 불러오기 (File In/Out Stream, Java DataBase Connectivity)
	
	// 1) 객체를 파일로 저장 (직렬화/역직렬화가 가능한 클래스여야 한다) implement Serializable
	// 2) 컬렉션은 대부분 직렬화를 지원한다
	
	void save() throws IOException {	// 파일에 저장
		File f = new File("phonebook.txt");						// 파일 객체
		FileOutputStream fos = new FileOutputStream(f);			// 파일을 대상으로 데이터를 보내는 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos); 	// 문자열이 아니라, 객체를 파일로 저장
		
		ArrayList<MemberVO> save = new ArrayList<MemberVO>(list);	
		// ObservableList 가 직렬화되지 않으므로, ArrayList로 변환
		
		oos.writeObject(save);
		oos.flush();
		oos.close();
	}
	
	@SuppressWarnings("unchecked")	// 확인 안된 자료형 변환에 대해서 언급하지 마라
	void load() throws IOException, ClassNotFoundException {
		File f = new File("phonebook.txt");
		if(f.exists() == false) {
			System.out.println("저장된 파일이 없습니다 : phonebook.txt" + f);
			f.createNewFile();
			list = FXCollections.observableArrayList();
			return;
		}
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<MemberVO> load = (ArrayList<MemberVO>)ois.readObject();
		list = FXCollections.observableList(load); 		//String만 준비되어 있고, SimpleStringProperty는 준비안됨
		for(MemberVO m : list) {
			m.setName(new SimpleStringProperty(m.getName_s()));
			m.setPnum(new SimpleStringProperty(m.getPnum_s()));
		}
		ois.close();
	}
	
	public Model() {
		try {
			load();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
