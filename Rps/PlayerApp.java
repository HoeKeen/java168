package Rps;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		{
			Player[] players = new Player[3];
			for (int i = 0; i < players.length; i++) {
				Player player = new Player();
				System.out.println("당신의 이름은??");
				player.setName(scanner.next());
				System.out.println("기록");
				player.setRecord(scanner.nextInt());
				players[i] = player;
			}
			Player[] ranking = new Player[3];
			String name = "";
			if (players[0].getRecord() < players[1].getRecord() && 
				players[1].getRecord() < players[2].getRecord()) {
				name = players[0].getName();
			} else if (players[1].getRecord() < players[0].getRecord() &&
						players[1].getRecord() < players[2].getRecord()) {
				name = players[1].getName();
			} else {
				name = players[2].getName();
			}

			System.out.println("1등은 " + name + "입니다.");
		}
	}
}