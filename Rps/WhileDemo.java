package Rps;

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("시스템을 종료하시겠습니까?");
			System.out.println("0.종료 1.유지");
			switch(scanner.nextInt()){
			case 0 : System.out.println("시스템을 종료합니다.");return;
			case 1 : System.out.println("시스템을 유지합니다.");break;
			}
			}
		}
	}