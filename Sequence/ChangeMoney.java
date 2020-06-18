package sequence;

import java.util.Scanner;

class Money {
	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void calc(int[] bills) {
		int count = 0;
		for (int i = 0; i < bills.length; i++) {
			System.out.printf("\r%d원권\r", bills[i]);
			count = money / bills[i];
			System.out.println(count + "장\r");
			money = money - count * bills[i];
			//System.out.println(money);
		}
	}
}

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Money money = new Money();
		while (true) {
			System.out.println("지폐 계산기");
			System.out.println("0.종료 1.시작");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료됩니다.");
				return;
			case 1:
				System.out.println("금액 입력");
				int input = scanner.nextInt();
				System.out.println("받은 금액");
				System.out.printf("\n%d원\r", input);
				int[] bills = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
				money.setMoney(input);
				money.calc(bills);
				System.out.println();
				break;
			default:
				System.out.println("정확한 값을 입력해주세요");
				break;
			}
		}
	}
}