package reply2;

import java.util.Date;

public class ReplyDTO {
	
//	TABLE	 REPLY2
//	IDX      NOT NULL NUMBER        
//	BOARDNUM NOT NULL NUMBER        
//	WRITER   NOT NULL NUMBER        
//	CONTEXT  NOT NULL VARCHAR2(500) 
//	CREDATE  NOT NULL DATE          
//	DELETED  NOT NULL NUMBER
	
//	USERID		 from MEMBER2
//	USERNAME 	 from MEMBER2
	
	private int idx, boardNum, writer, deleted;
	private String context, userid, username;
	private Date credate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getWriter() {
		return writer;
	}
	public void setWriter(int writer) {
		this.writer = writer;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getCredate() {
		return credate;
	}
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
