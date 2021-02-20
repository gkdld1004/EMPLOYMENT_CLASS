package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_Set {
	public static void main(String[] args) {
		// 	순번이 없고, 데이터의 중복을 허용하지 않는다 !!
		
//		Set ob1 = new Set();		// Cannot instantiate the type Set
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add("ITBANK");
		hs.add(20);
		
		System.out.println("hs의 크기 : " + hs.size());
		
		for(int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(index));		// 순번, index가 존재하지 않는다.
		}
		
		for(Object element : hs) {		// hs 내부의 각각의 요소를 Object 형의 element라고 할 때
			System.out.println(element);
		}
		System.out.println();
		
		Iterator it = hs.iterator();		// Set 내부의 요소를 순환 가능한 형태로 반환한다.
		
		while(it.hasNext()) {		// 순환자의 내부에 확인하지 않은 다음 요소가 있다면
			System.out.println(it.next());		// 그 값을 출력한다.
		}
		System.out.println();
		
		// Random한 정수를 받아서, Set의 크기가 5가 될 때까지 add를 수행한다.
		// 중복되지 않는 5개의 정수를 추출하기 위한 방법
		// 7, 25, 309, -11, 100
		
		
		
	}
}
