package marix;

public class MartixBasic {
public static void main(String[] args) {
	int sum = 0;
	int[][] mtx = new int[5][5]; //[행] [열]
	for(int i=0;i<mtx.length;i++) {
		System.out.println();
		for(int j=0;j<mtx[i].length;j++) {
			sum = sum + 5;
			mtx[i][j] = sum;
			//혹은, k=1
			//mtx[i][j] = k++*5 해도 결과는 같음
			System.out.printf(mtx[i][j]+"\t");
}
}
}
}