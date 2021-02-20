package dependency;

public class Toy {

	AAA battery;
	
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
