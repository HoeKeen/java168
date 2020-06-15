package Sequence;

public class Sequence {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int odd = 0; 
		int i = 0;
		while (true) {
			if (i < arr.length) {
				if (arr[i] % 2 == 0) {
					sum += arr[i];			
				}
				i++;
				continue;
			} else {
				break;
			}
		}
		System.out.println(sum);
		//System.out.println(odd);
	}
}