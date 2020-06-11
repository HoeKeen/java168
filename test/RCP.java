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

		if (user == computer) {
			System.out.println("비겼습니다.");
		} else if (user == 1)// 가위
		{
			if (computer == 2)// 바위
			{
				System.out.println("컴퓨터의 선택:바위");
				System.out.println("당신은 졌습니다.");
			} else if (computer == 3)// 보
			{
				System.out.println("컴퓨터의 선택:보");
				System.out.println("당신은 이겼습니다.");
			}
		} else if (user == 2) // 바위
			if (computer == 1)// 가위
			{
				System.out.println("컴퓨터의 선택:가위");
				System.out.println("당신은 이겼습니다.");
			} else if (computer == 3)// 보
			{
				System.out.println("컴퓨터의 선택:보");
				System.out.println("당신은 졌습니다.");
			} else // 보
			{
				if (computer == 1)// 가위
				{
					System.out.println("컴퓨터의 선택:가위");
					System.out.println("당신은 졌습니다.");
				} else if (computer == 2)// 바위
				{
					System.out.println("컴퓨터의 선택:바위");
					System.out.println("당신은 이겼습니다.");
				}
			}
	}
}