package day20_file;

public class Member {
//	1) 클래스가 저장해야 할 정보를 private 으로 멤버 필드로 작성한다.
//	2) 생성자를 작성한다. (생략 가능)
//	3) 이클립스 화면 빈 곳에 오른쪽 클릭 -> Source -> Generate Getter and Setters..
//	4) Select All -> Last Member -> Generate
	
	private String name;
	private String gender;
	private String phoneNumber;
	
	public Member(String name, String gender, String phoneNumer) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumer;
	}
	
	@Override
	public String toString() {		// from Object
		String ret = "";
		ret += name + "\t";
		ret += gender + "\t";
		ret += phoneNumber + "\t";
		return ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
