package dependency2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toy {
	
	@Autowired
	private AAA battery;		// 초기화를 하지 않더라도, setter 메서드가 없어도
								// AAA 클래스가 스프링 빈으로 등록되어 있다면
								// 클래스와 객체 이름을 기반으로 찾아서 자동으로 연결해준다
								// 자동으로 의존 주입을 처리해준다
	
	public AAA getBattery() {
		return battery;
	}
	
	public void setBattery(AAA battery) {		
		this.battery = battery;
	}
	
	public void run() {			// 객체에 의해서 수행되어야 하는 메서드
		if(battery != null) {	// 배터리가 없으면 동작하지 않는다
			System.out.println(getClass().getSimpleName() + "장난감이 작동합니다");
		}
		else {
			System.err.println("배터리가 없습니다");
		}
	}
	
	// Toy 클래스의 객체는 AAA에 대하여 의존성(dependency)을 가진다
	// Toy는 AAA가 필요하다
	
}
