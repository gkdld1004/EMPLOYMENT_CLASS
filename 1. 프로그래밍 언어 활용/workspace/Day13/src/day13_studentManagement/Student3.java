package day13_studentManagement;

public class Student3 extends Student {

	int kor, eng, mat;
	
	Student3(String name, int kor, int eng, int mat) {
		super(name);
		this.kor = kor; 
		this.eng = eng;
		this.mat = mat;
//		this.sum = kor + eng + mat;		// this, super 둘다 가능 
		super.sum = kor + eng + mat;
		avg = sum / 3.0;				// 안적는 것도 가능
	}
	
	@Override		// 슈퍼클래스로부터 물려받은 메서드의 내용을 재정의한다.
	void show() {
		System.out.printf("%s : %3d, %3d, %3d\t\t (%3d, %3.2f)\n",
				name, kor, eng, mat, sum, avg);
	}

}
