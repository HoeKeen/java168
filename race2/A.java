package race2;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
			Scanner	 scanner = new Scanner(System.in);{
		Player[] players = new Player[3];
	for(int i=0;i<players.length;i++) {
		Player player = new Player();
		System.out.println("당신의 이름은??");
		player.setName(scanner.next());
		System.out.println("기록");
		player.setRecord(scanner.nextInt());
		players[i]=player;
		}
	Player[] ranking = new Player[3];
	
	if(players[0].getRecord()<players[1].getRecord() &&  
		players[1].getRecord()<players[2].getRecord())//abc
		
		System.out.println(
				"1등은 "+ranking[0].getName()+
				"2등은 "+ranking[1].getName()+
				"3등은 "+ranking[2].getName()+"입니다.");
			
}
}
}