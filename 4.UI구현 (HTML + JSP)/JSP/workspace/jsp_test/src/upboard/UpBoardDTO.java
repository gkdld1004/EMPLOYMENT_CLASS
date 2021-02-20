package upboard;

import java.util.Date;

public class UpBoardDTO {

//	IDX        NOT NULL NUMBER        
//	USERIDX    NOT NULL NUMBER        
//	CREATEDATE NOT NULL DATE          
//	CONTEXT    NOT NULL VARCHAR2(100)
	
	private int idx, useridx, bdidx;
	private Date createDate;
	private String context;
	private String id, name;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getUseridx() {
		return useridx;
	}
	public void setUseridx(int useridx) {
		this.useridx = useridx;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public int getBdidx() {
		return bdidx;
	}
	public void setBdidx(int bdidx) {
		this.bdidx = bdidx;
	}
}
