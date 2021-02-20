package dependency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	private AA aa1, aa2;
	
	public Clock(AA aa1, AA aa2) {		// setter 대신 작성
		this.aa1 = aa1;
		this.aa2 = aa2;
	}
	
	public void run() {
		if(aa1 != null && aa2 != null) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분");
			
			System.out.println("현재 시간은" + sdf.format(date) + "입니다");
		}
		else {
			System.out.println("배터리가 없습니다");
		}
	}
	
}
