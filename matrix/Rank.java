package matrix;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[5];
		int[] rank = new int[5];
		for (int i = 0; i < rank.length; i++) {
			System.out.println("점수: ");
			score[i] = scanner.nextInt();
			rank[i] = 1;
		}
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%d등 : %d 점\n", rank[i], score[i]);
		}
	}
}