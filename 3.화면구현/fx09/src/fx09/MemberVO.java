package fx09;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class MemberVO implements Serializable {	// 직렬화 가능한
	
	private static final long serialVersionUID = -1660107437456207327L;
	// 직렬화된 객체를 구분할 수 있는 고유번호

	// 이름과 전화번호 속성을 가지는 단위 유닛 클래스
	
	private transient SimpleStringProperty name;	// transient : 직렬화 시 대상에서 제외한다
	private transient SimpleStringProperty pnum;	// SimpleStringProperty는 직렬화되지 않는다
	private String name_s;
	private String pnum_s;
	
	public MemberVO(String name, String pnum) {	// 생성자에서는 일반 문자열을 받아서
		this.name = new SimpleStringProperty(name);
		this.pnum = new SimpleStringProperty(pnum);
		setName_s(name);
		setPnum_s(pnum);
	}

	public SimpleStringProperty getName() {
		return name;
	}

	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

	public SimpleStringProperty getPnum() {
		return pnum;
	}

	public void setPnum(SimpleStringProperty pnum) {
		this.pnum = pnum;
	}

	public String getName_s() {
		return name_s;
	}

	public void setName_s(String name_s) {
		this.name_s = name_s;
	}

	public String getPnum_s() {
		return pnum_s;
	}

	public void setPnum_s(String pnum_s) {
		this.pnum_s = pnum_s;
	}
}
