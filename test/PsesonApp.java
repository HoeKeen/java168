package test;

import java.util.Scanner;

public class PsesonApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person[] persons = new Person[3];
		for (int i = 0; i < 3; i++) {
			Person person = new Person();
			System.out.println("당신의 이름은?");
			person.name = scanner.next();
			System.out.println("당신의 나이는?");
			person.age = scanner.nextInt();
			System.out.println("키는?");
			person.height = scanner.nextFloat();
			persons[i] = person;
		}
		for (int i = 0; i < 3; i++) {
			persons[i].printStates();
		}
	}
}