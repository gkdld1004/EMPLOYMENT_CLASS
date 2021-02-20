package day09;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] nameArr = { "원빈", "현빈", "박현빈", "전혜빈", "김우빈" };
		int[] ageArr = { 44, 39, 40, 38, 32 };
		
		for(int i = 0; i < nameArr.length; i++) {
			System.out.printf("%s\t : %d살\n", nameArr[i], ageArr[i]);
		}
		System.out.println();
		
		// 위 항목들을 나이 순으로 오름차순 정렬하여 다시 출력하세요. (선택정렬을 사용)
		
		for(int i = 0; i < ageArr.length; i++) {
			for(int j = i + 1; j < ageArr.length; j++) {
				if(ageArr[i] > ageArr[j]) {
					int tmp = ageArr[i];
					ageArr[i] = ageArr[j];
					ageArr[j] = tmp;
					
					String tmp1 = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = tmp1;
				}
			}
		}
		
		for(int i = 0; i < nameArr.length; i++) {
			System.out.printf("%s\t : %d살\n", nameArr[i], ageArr[i]);
		}
		System.out.println();
	}
}
