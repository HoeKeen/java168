package test;

import java.util.Scanner;

public class GradeDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력");
		String name = scanner.next();
		System.out.println("영어");
		final String ENG = "영어";
		System.out.println("점수");
		int score = scanner.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}

		System.out.println("********************************");
		System.out.println("    이름     과목   점수  등급");
		System.out.println("-----------------------------------");
		System.out.println("| " + name + " | " + ENG + " | " + score + " | " + grade + " |");
		System.out.println("*********************************/");
	}
}