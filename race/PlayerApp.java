package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] team = new Player[3];
	for(int i=0;i<team.length;i++) {
		Player man = new Player();
		System.out.println("이름은?");
		man.setName(scanner.next());
		System.out.println("기록입력:");
		man.setRecord(scanner.nextInt());
		team[i]=man;
		}
	for(int i=0;i<team.length;i++) {
		team[i].state();
		}
	
	Player[] ranking = new Player[3];
	
	if(team[0].getRecord()>team[1].getRecord() && team[1].getRecord()>team[2].getRecord()) {
			ranking[0] = team[0];
		}
		else if (team[1].getRecord()>team[2].getRecord() && team[0].getRecord()>team[1].getRecord()) 
	 {ranking[0] = team[1];}
		else {ranking[0] = team[2];} 

	System.out.println("1등은 "+ranking[0].getName()+"입니다.");}
	} 
