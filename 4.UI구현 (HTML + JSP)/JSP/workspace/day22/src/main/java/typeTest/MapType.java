package typeTest;

import java.util.Map;

public class MapType {

	private Map<String, String> map;

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public void showMap() {
		
		System.out.println("=== 맵 출력 ===");
		
//		for(String key : map.keySet()) {
//			String value = map.get(key);
//			System.out.println(key + " : " + value);
//		}
		
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		System.out.println("=== 맵 출력 끝 === ");
	}
	
}
