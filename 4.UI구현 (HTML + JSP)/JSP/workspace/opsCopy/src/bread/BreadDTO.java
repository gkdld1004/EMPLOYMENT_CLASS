package bread;

public class BreadDTO {

//	TABLE	BREAD1
//	IDX    NOT NULL NUMBER       
//	BNAME  NOT NULL VARCHAR2(20) 
//	BPRICE NOT NULL NUMBER  
	
	private int idx, bprice;
	private String bname;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
}
