package day12;

class Student {		// 부모(super) 클래스 
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void show() {
		sum = kor + eng + mat;
		avg = sum / 3.0;
		System.out.println(name + " : " + sum + ", " + avg);
	}
}

class Student2 extends Student {		// 자식 클래스
//	String name;
//	int kor, eng, mat, sum;
//	double avg;
	// 생략되었지만 다 가지고 있는 것으로 간주
	int deu;
	
	Student2(String name, int kor, int eng, int mat, int deu){
		super(name, kor, eng, mat);		// 첫줄에 써야함. 자신의 슈퍼클래스의 생성자를 호출하면서 인자를 전달한다.
		this.deu = deu;					// 없는 것은 직접 입력 
	}
	
	@Override		// Java Annotation. 이건 재정의된 메서드 입니다 !!
	void show() {
		sum = kor + eng + mat + deu;
		avg = sum / 4.0;
		System.out.println(name + " : " + sum + ", " + avg);
	}
}

public class Ex03_Inheritance {
	public static void main(String[] args) {
		
		// 학생관리 프로그램을 작성하고 있다.
		// 기존에 사용하던 Student 클래스를 세분화해서 
		// 국,영,수 만 점수를 계산하는 학생(고1, 2)과 
		// 제2외국어를 포함하여 성적을 계산하는 학생(고3)을 구분하여 처리하려고 한다.
		
		// 비슷한 항목이 많은 클래스를 새로 작성하려고 하니 불편해서
		// 기존의 Student 클래스의 내용을 받아오려면 어떻게 해야 할까 ?
		
		Student2 st = new Student2("이지은", 100, 99, 87, 79);
		st.show();
		
	}
}
