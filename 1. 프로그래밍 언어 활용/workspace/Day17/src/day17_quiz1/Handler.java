package day17_quiz1;

import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	private ArrayList<PlayableCharacter> list;			// 멤버 필드
	private Scanner sc;
	
	public Handler() {									// 생성자
		list = new ArrayList<PlayableCharacter>();
	}
	
	public boolean insert(PlayableCharacter p) {		// 생성	Create
		return list.add(p);
	}
	
	public PlayableCharacter selectOne(String name) {	// 읽기	Read
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);		// ob = arr[i];
//			if(ob != null & ob.getName().equals(name)) {
//				배열은 공간이 이미 확보된 상태에서, 빈 칸일수도 있고, 데이터가 있을 수도 있다.
//				리스트의 경우, 의도적으로 null을 삽입하지 않는다면, 데이터는 null일 확률이 대폭 낮아진다.
//			}
			if(ob.getName().equals(name)) {
				return ob;
			}
		}
		return null;
	}
	
	public boolean modify(String name) {		// 수정	Update
		
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);
			if(ob.getName().equals(name)) {
				System.out.println(ob);
				// 이름은 변경하지 않고, 수치만 변경하게 끔
				System.out.print("공격력 : ");
				int atk = sc.nextInt();
				System.out.println("체력 : ");
				int hp = sc.nextInt();
				
				ob.setAtk(atk);
				ob.setHp(hp);
				return true;
			}
		}		// end of for
		return false;
	}
	
	public boolean delete(String name) {		// 삭제	Delete
		
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);
			if(ob.getName().equals(name)) {
				list.remove(i);		// arr[i] = null; 배열에서의 형식
									// 객체만 삭제할 뿐, 공간은 사라지지 않는다.
				
//				list.remove(i);	는 i번째 객체를 삭제하고, 공간도 축소시켜주기 때문에 빈칸이 발생하지 않는다.
				return true;
			}
		}
		return false;
	}
	
}
