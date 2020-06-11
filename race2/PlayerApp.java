package race2;
import java.util.Scanner;
public class PlayerApp {
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
	{ranking[0]=players[0];}
	{ranking[1]=players[1];}
	{ranking[2]=players[2];}
	
	if(players[0].getRecord()<players[1].getRecord() && 
		players[2].getRecord()<players[1].getRecord() &&
		players[0].getRecord()<players[2].getRecord()) //acb
	{ranking[0]=players[0];}
	{ranking[1]=players[2];}
	{ranking[2]=players[1];}
	
	if(players[1].getRecord()<players[2].getRecord() &&
		players[2].getRecord()<players[0].getRecord()) //bca
	{ranking[0]=players[1];}
	{ranking[1]=players[2];}
	{ranking[2]=players[0];}
	
	if(players[1].getRecord()<players[2].getRecord() &&
		players[0].getRecord()<players[2].getRecord() &&
		players[1].getRecord()<players[0].getRecord()) //bac
	{ranking[0]=players[1];}
	{ranking[1]=players[0];}
	{ranking[2]=players[2];}
	
	if(players[2].getRecord()<players[1].getRecord() && 
		players[0].getRecord()<players[1].getRecord()) //cab
	{ranking[0]=players[2];}
	{ranking[1]=players[0];}
	{ranking[2]=players[1];}
	
	if(players[2].getRecord()<players[1].getRecord() && 
			players[0].getRecord()<players[1].getRecord() &&
			players[2].getRecord()<players[0].getRecord()) //cba
	{ranking[0]=players[2];}
	{ranking[1]=players[1];}
	{ranking[2]=players[0];}
		  
	System.out.println(
			"1등은 "+ ranking[0].getName()+
			"\r2등은 "+ ranking[1].getName()+
			"\r3등은 "+ ranking[2].getName()+"입니다.");
}
}
}