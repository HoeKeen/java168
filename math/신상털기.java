package math;
import java.util.Scanner;
public class �Ż��б�{
	public static void main(String[] args) {
		Scanner �Է°� = new Scanner(System.in);
		���� �Է� = new ����();
		System.out.println("�̸��� ���ϱ�?");
		�Է�.name = �Է°�.next();
		System.out.println("���̰� ���Դϱ�?");
		�Է�.age = �Է°�.nextInt();
		System.out.println("Ű�¿�?");
		�Է�.height = �Է°�.nextFloat();
		�Է�.���();
	}
}