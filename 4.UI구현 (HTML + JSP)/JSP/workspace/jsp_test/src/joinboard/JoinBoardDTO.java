package joinboard;

public class JoinBoardDTO {

//	IDX     NOT NULL NUMBER 
//	BDIDX   NOT NULL NUMBER 
//	USERIDX NOT NULL NUMBER 
//	ANSWER  NOT NULL VARCHAR2(50)
	
	private int idx, bdidx, useridx;
	private String answer, id, name;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getBdidx() {
		return bdidx;
	}

	public void setBdidx(int bdidx) {
		this.bdidx = bdidx;
	}

	public int getUseridx() {
		return useridx;
	}

	public void setUseridx(int useridx) {
		this.useridx = useridx;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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
