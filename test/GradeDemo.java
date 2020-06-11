package test;

import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args) {
		String result = "";
		Scanner scanner = new Scanner(System.in);
		result = "A의 점수";
		int a = scanner.nextInt();
		result = "B의 점수";
		int b = scanner.nextInt();
		result = "C의 점수";
		int c = scanner.nextInt();
		
		
		if (a>b && b>c) {
			result = "A가 이겼습니다.";
			}
		else if (b>a && b>c) {
			result = "B가 이겼습니다.";
		}
		else {
			result = "C가 이겼습니다.";
		}
		}
}
