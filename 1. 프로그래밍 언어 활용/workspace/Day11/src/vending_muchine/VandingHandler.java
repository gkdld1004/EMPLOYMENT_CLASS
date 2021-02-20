package vending_muchine;

import java.util.Scanner;

public class VandingHandler {
	private VandingM[] drink = new VandingM[3];
	private int money;
	private Scanner sc = new Scanner(System.in);
	private String name;

	public void start() {

		for (int i = 0; i < drink.length; i++) {
			drink[i] = new VandingM();
		}

		drink[0].setDrink("물");
		drink[0].setPrice(900);
		drink[1].setDrink("탄산");
		drink[1].setPrice(2000);
		drink[2].setDrink("이온음료");
		drink[2].setPrice(1500);

		while (true) {
			System.out.println("물(900원) 탄산(2000원) 이온음료(1500원)");
			System.out.println("======= 자판기 ==========\n");
			System.out.println("1. 금액 투입");
			System.out.println("2. 선택");
			System.out.println("3. 종료");
			System.out.print("선택 >>> ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.print("투입금액>> ");
				int money = sc.nextInt();
				showDrink(money);
				break;
			case 2:
				outDrink();
				break;
			case 3:
				System.out.println("감사합니다.");
				System.out.println("잔돈 반환 : " + this.money);
				return;
			default:
				System.err.println("잘못된 입력 !! 다시 입력 !! ");
			}
		}
	}

	public void showDrink(int money) {
		this.money += money;

		System.out.println("\n============== 선택가능음료 =================");
		for (int i = 0; i < drink.length; i++) {
			if (drink[i].getPrice() <= money) {
				System.out.printf("\t%s : %d원\n", drink[i].getDrink(), drink[i].getPrice());
			}
		}
		System.out.println("=========================================\n");
	}

	public void outDrink() {
		System.out.print("선택할 음료 입력 : ");
		name = sc.next();
		for (int i = 0; i < drink.length; i++) {
			if (name.equals(drink[i].getDrink())) {
				if (money < drink[i].getPrice()) {
					System.err.println("잔액부족 !");
					System.out.println("잔돈 : " + money);
					return;
				} else {
					System.out.println(drink[i].getDrink() + "선택");
					money -= drink[i].getPrice();
					System.out.println("잔돈 : " + money);
				}
			}
		}
	}

}
