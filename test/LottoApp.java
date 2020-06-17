package test;

import java.util.Random;
import java.util.Scanner;

class Lotto {
	private int limit;

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public int buy(int money) {
		int count = 0;
		if (money < 1000) {
			System.out.println("1000원 이상 넣어주세요");
		} else {
			if (money < limit * 1000) {
				count = money / 1000;
			} else {
				count = limit;
			}
			// count = (limit>money/1000)? money/ 1000:limit ;
		}
		return count;
	}
}

public class LottoApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("최대 구매 제한");
		Lotto lot = new Lotto();
		lot.setLimit(scanner.nextInt());

		while (true) {
			System.out.println("인생로또를 노려보세요\r0.종료 1.구입");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료되었습니다.");
				return;
			case 1:
				buy(scanner, lot);
				break;
			default:
				System.out.println("0번 혹은 1번을 입력하세요");
				break;
			}
		}
	}

	public static void buy(Scanner scanner, Lotto lot) {
		System.out.println("구입");
		System.out.println("입금액: ");
		System.out.printf("구입 로또 %d 장\n", lot.buy(scanner.nextInt()));
	}
}