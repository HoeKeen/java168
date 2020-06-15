package test;

import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("당신의 점수는?");
			score[i] = scanner.nextInt();
		}

		/*
		 * System.out.println("B의 점수"); int b = scanner.nextInt();
		 * System.out.println("C의 점수"); int c = scanner.nextInt();
		 */

		//1등의 점수
		int result = 0;;
		if (score[0] > score[1] && score[0] > score[2]) {
			result = score[0];
		} else if (score[1] > score[0] && score[1] > score[2]) {
			result = score[1];
		} else {
			result = score[2];
		}
		System.out.println("1등의 점수는 "+result+"점 입니다.");
	}
}
