package race;
import java.util.Scanner;
public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] team = new Player[3];
	for(int i=0;i<team.length;i++) {
		Player man = new Player();
		System.out.println("����� �̸���?");
		man.setName(scanner.next());
		System.out.println("�޸��� ���");
		man.setRecord(scanner.nextInt());
		team[i]=man;
		}
	for(int i=0;i<team.length;i++) {
		team[i].state();
	}
	}
}
