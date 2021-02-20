package member;

public class MemberDTO {

//	IDX      NOT NULL NUMBER        
//	ID       NOT NULL VARCHAR2(50)  
//	PASSWORD NOT NULL VARCHAR2(500) 
//	NAME     NOT NULL VARCHAR2(20)  
//	GENDER   NOT NULL VARCHAR2(20)  
//	EMAIL    NOT NULL VARCHAR2(100)
	
	private int idx;
	private String id, password, name, gender, email;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
