package test;
import java.util.Scanner;
class 이름바꾸기 {
	public static void main(String[] agrs) {
		System.out.println("이름이 뭡니까");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("제 이름은 "+name+"입니다.");
	}
}