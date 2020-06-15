package Sequence;

public class Sequence5050 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int i = 0;
		for (;;) {
			if( i < arr.length) {
			sum = sum + arr[i]; // sum += arr[i]
			i++;
			continue;
			}else {
				break;
			}
			
		}
		System.out.println(sum);
	}
}