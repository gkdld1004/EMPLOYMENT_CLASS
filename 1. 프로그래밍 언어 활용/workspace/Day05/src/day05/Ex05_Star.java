package day05;

public class Ex05_Star {
	public static void main(String[] args) {
		
		// 마름모
		int size = 5;
		int star = 1;
		int space = size / 2;		
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < space; j++) {		// 공백을 지정된 개수만큼 출력 (초기값 : 2)
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {			// 문자를 지정된 개수만큼 출력 (초기값 : 1)
				System.out.print("* ");
			}
			for(int j = 0; j < space; j++) {		// 공백을 지정된 개수만큼 출력 (초기값 : 2)
				System.out.print("  ");
			}
			if(i < size / 2) {
				star += 2;
				space -= 1;
			}
			else {
				star -= 2;
				space += 1;
			}
			System.out.println();
		}
		System.out.println();
		
//		---------------------------------------------------------------------------
		
		// 우측화살표
		int size1 = 5;
		int star1 = 1;
				
		for(int i = 0; i < size1; i++) {
			
			for(int j = 0; j < star1 ;j++) {
				System.out.print("* ");
			}
			
			if(i < 2) {
				star1 += 1;
			}
			else {
				star1 -= 1;
			}
			System.out.println();
		}
		System.out.println();
		
//		---------------------------------------------------------------------------
		
		// 모래시계
		int size2 = 5;
		int star2 = 5;
		int space2 = 0;
		
		for(int i =0; i < size2; i++) {
			for(int j = 0; j < space2; j++) {		
				System.out.print("  ");
			}
			for(int j = 0; j < star2; j++) {			
				System.out.print("* ");
			}
			
			if(i < size2 / 2) {
				star2 -= 2;
				space2 += 1;
			}
			else {
				star2 += 2;
				space2 -= 1;
			}
			System.out.println();
		}
		System.out.println();
//		---------------------------------------------------------------------------
		
		// 나비모양
		int size3 = 5;
		int star3 = 1;
		int space3 = size3 / 2 + 1;
		
		for(int i = 0; i < size3; i++) {
			
			for(int j = 0; j < star3; j++) {			
				System.out.print("* ");
			}
			for(int j = 0; j < space3; j++) {		
				System.out.print("  ");
			}
						
			int starR = star3;
			if(i == size3 / 2)
				starR = size3 - star3;
			
			for(int j = 0; j < starR; j++) {
				System.out.print("* ");
			}
			
			if(i < size3 / 2) {
				star3 += 1;
				space3 -= 2;
			}
			else {
				star3 -= 1;
				space3 += 2;
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
}
