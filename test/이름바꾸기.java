package test;
import java.util.Scanner;
class 이름바꾸기 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭡니까");
		String name = scanner.next();
		System.out.println("제 이름은 "+name+"입니다.");
	}
}