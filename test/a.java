package test;
import java.util.Scanner;
public class a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	asd[] students = new asd[3];
	for(int i=0;i<students.length;i++){
		asd student = new asd();
		System.out.println("����� �̸���?");
		student.name = scanner.next();
		System.out.println("����� ����������?");
		student.kor = scanner.nextInt();
		System.out.println("����� ����������?");
		student.eng = scanner.nextInt();
		System.out.println("����� ����������?");
		student.math = scanner.nextInt();
		student.sum = student.kor+student.eng+
				student.math;
		student.avg = student.sum/3;
		students[i] = student;
		}
	for(int i=0;i<students.length;i++){
		students[i].states();
				}
	}
}
