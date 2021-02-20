package typeTest;

public class PrimitiveType {

	private boolean bo;
	private byte by;
	private short sh;
	private char ch;
	private int num;
	private long ln;
	private float fl;
	private double db;
	private String str;
	
	public void test() {
		System.out.println("bo : " + bo);
	}
	
	public void showAll() {
		System.out.println(bo);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(ch);
		System.out.println(num);
		System.out.println(ln);
		System.out.println(fl);
		System.out.println(db);
		System.out.println(str);
	}

	public void setBo(boolean bo) {
		this.bo = bo;
	}

	public void setBy(byte by) {
		this.by = by;
	}

	public void setSh(short sh) {
		this.sh = sh;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setLn(long ln) {
		this.ln = ln;
	}

	public void setFl(float fl) {
		this.fl = fl;
	}

	public void setDb(double db) {
		this.db = db;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
