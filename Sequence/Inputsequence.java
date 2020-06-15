package Sequence;

import java.util.Scanner;

public class Inputsequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 합산하고자 하는 한계숫자를 입력");
		int lim = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= lim; i++)
			if (i % 2 == 1) sum = sum + i;
		System.out.println(sum);
	}
}