package answer;

public class AnswerDTO {

//	ANSWER TABLE
	
//	AIDX      NOT NULL NUMBER 
//	ANSWERNUM NOT NULL NUMBER 
//	MEMBERNUM NOT NULL NUMBER 
//	REPLY     NOT NULL NUMBER 
	
	private int aidx, answernum, membernum, reply;
	private String id, name;

	public int getAidx() {
		return aidx;
	}

	public void setAidx(int aidx) {
		this.aidx = aidx;
	}

	public int getAnswernum() {
		return answernum;
	}

	public void setAnswernum(int answernum) {
		this.answernum = answernum;
	}

	public int getMembernum() {
		return membernum;
	}

	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}

	public int getReply() {
		return reply;
	}

	public void setReply(int reply) {
		this.reply = reply;
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
