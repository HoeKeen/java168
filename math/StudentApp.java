package math;
import java.util.Scanner;
public class StudentApp{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	Student[] students = new Student[3] ;
	for(int i=0;i<students.length;i++) {
		Student student = new Student();
		System.out.println("당신의 이름은?");
		student.setName(scanner.next());
		System.out.println("당신의 국어점수는?");
		student.setKor(scanner.nextInt());
		System.out.println("당신의 영어점수는?");
		student.setEng(scanner.nextInt());
		System.out.println("당신의 수학점수는?");
		student.setMath(scanner.nextInt());
		student.sum();
		student.avg();
		students[i] = student;
		}
	for(int i=0;i<students.length;i++) {
		students[i].states() ;
	}
}
}