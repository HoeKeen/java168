package matrix;

import java.util.Random;

public class Rank3 {
	public static void main(String[] args) {

		Random random = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(101);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;						
			}
		}
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d등 %d점\r",i+1,arr[i]);
		}
	}
}