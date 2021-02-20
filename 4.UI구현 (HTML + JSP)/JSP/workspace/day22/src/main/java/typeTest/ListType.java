package typeTest;

import java.util.List;

public class ListType {

	private List<String> accounts;

	// setter
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}
	
	public void showList() {
		System.out.println("=== 리스트 출력 ===");
		
//		accounts.forEach(System.out::println);
		
//		for(int i = 0; i < accounts.size(); i++) {
//			System.out.println(accounts.get(i));
//		}
		
		for(String str : accounts) {
			System.out.println(str);
		}
		
		System.out.println("=== 리스트 출력 종료 === \n");
	}
	
}
