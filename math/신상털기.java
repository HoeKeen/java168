package math;
import java.util.Scanner;
public class 신상털기{
	public static void main(String[] args) {
		Scanner 입력값 = new Scanner(System.in);
		형식 입력 = new 형식();
		System.out.println("이름이 뭡니까?");
		입력.name = 입력값.next();
		System.out.println("나이가 몇입니까?");
		입력.age = 입력값.nextInt();
		System.out.println("키는요?");
		입력.height = 입력값.nextFloat();
		입력.결과();
	}
}