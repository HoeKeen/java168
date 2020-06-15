package test;

import java.util.Random;
import java.util.Scanner;

public class RCP {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// RCP player = new RCP();

		System.out.println("가위,바위,보를 고르세요.");
		System.out.println("1.가위\r2.바위\r3.보");
		int user = scanner.nextInt();

		Random random = new Random();
		int computer = random.nextInt(3) + 1;

		System.out.print("컴퓨터가 ");

		if (computer == 1) {

			System.out.print("가위");

		} else if (computer == 2) {

			System.out.print("바위");

		} else {

			System.out.print("보");

		}

		System.out.println("를 냈습니다.");

		System.out.print("사용자가 ");

		if (user == 1) {

			System.out.print("가위");

		} else if (user == 2) {

			System.out.print("바위");

		} else {

			System.out.print("보");

		}

		System.out.println("를 냈습니다.");

		// 이겼습니다.

		// 비겼습니다.

		// 졌습니다.

		if (computer == user) { // 컴퓨터와 사용자가 값은 값을 냈다면,

			System.out.println("비겼습니다.");

		} else if ((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {

			System.out.println("이겼습니다.");

		} else {

			System.out.println("졌습니다.");

		}
	}
}
/*
 * if (user == computer) { System.out.println("비겼습니다."); } else if (user == 1)//
 * 가위 { if (computer == 2)// 바위 { System.out.println("컴퓨터의 선택:바위");
 * System.out.println("당신은 졌습니다."); } else if (computer == 3)// 보 {
 * System.out.println("컴퓨터의 선택:보"); System.out.println("당신은 이겼습니다."); } } else
 * if (user == 2) // 바위 if (computer == 1)// 가위 {
 * System.out.println("컴퓨터의 선택:가위"); System.out.println("당신은 이겼습니다."); } else if
 * (computer == 3)// 보 { System.out.println("컴퓨터의 선택:보");
 * System.out.println("당신은 졌습니다."); } else // 보 { if (computer == 1)// 가위 {
 * System.out.println("컴퓨터의 선택:가위"); System.out.println("당신은 졌습니다."); } else if
 * (computer == 2)// 바위 { System.out.println("컴퓨터의 선택:바위");
 * System.out.println("당신은 이겼습니다."); } } } }
 */