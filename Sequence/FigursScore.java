package Sequence;

import java.util.Scanner;

public class FigursScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int max = 0, min = 100;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("점수입력 ");
			arr[i] = scanner.nextInt();
			sum += arr[i];
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];
		}
		avg = (sum - max - min) / 3;
		//sum = sum - max;, sum - min 한다음
		//평균 : sum/3 으로 평균 구하는것도 가능 
		System.out.println("최고점 : " + max);
		System.out.println("최하점 : " + min);
		System.out.println("평균점 : " + avg);
	}
}
