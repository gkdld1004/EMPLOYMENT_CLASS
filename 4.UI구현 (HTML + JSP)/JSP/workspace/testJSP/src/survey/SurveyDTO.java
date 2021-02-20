package survey;

import java.util.Date;

public class SurveyDTO {

//	SURVEY TABLE
	
//	SIDX      NOT NULL NUMBER        
//	REGMEMBER NOT NULL NUMBER        
//	REGDATE   NOT NULL DATE          
//	CONTEXT   NOT NULL VARCHAR2(100) 
	
	private int sidx, regmember;
	private Date regdate;
	private String context;
	private String id, name;
	
	public int getSidx() {
		return sidx;
	}
	public void setSidx(int sidx) {
		this.sidx = sidx;
	}
	public int getRegmember() {
		return regmember;
	}
	public void setRegmember(int regmember) {
		this.regmember = regmember;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
