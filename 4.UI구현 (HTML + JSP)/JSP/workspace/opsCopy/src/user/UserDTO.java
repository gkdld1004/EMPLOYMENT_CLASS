package user;

import java.util.Date;

public class UserDTO {

//	TABLE	 USER1
//	IDX      NOT NULL NUMBER        
//	USERID   NOT NULL VARCHAR2(20)  
//	USERPW   NOT NULL VARCHAR2(500) 
//	USERNAME NOT NULL VARCHAR2(20)  
//	PNUM     NOT NULL VARCHAR2(20)  
//	CREDATE  NOT NULL DATE 
	
	private int idx;
	private String userid, userpw, username, pnum;
	private Date credate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public Date getCredate() {
		return credate;
	}
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
}
