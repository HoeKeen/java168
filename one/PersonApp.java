package one;

import java.util.Scanner;

import member.Member;

/*RPF
Psreson(id,pass,name:String)
 - Student(ssn:String(주민번호),gender,score:int),
 - Admin(rank:int)
<사용자기능> Student
1.회원가입
2.로그인
3.비번수정
4.회원탈퇴
5.아이디 존재 체크
6.마이페이지
7.점수입력
8.관리자 기능
<관리자기능> Admin 

1.회원목록
2.아이디검색
3.이름검색
4.전체회원수
5.성적별 현황(스코어 기준 이름 내림차순)ex 1등 이순신(남) 98점, 2등 신사임당(여) 85점...
*/

class Constants {
	public static final String MAN_MENU = "0.시스템종료 1.학생 2.관리자";
	public static final String STUDENT_MENU = "0.학생화면 종료 \n" + " 1. 회원가입\n" + " 2. 로그인 \n" + " 3. 비번 수정\n"
			+ " 4. 회원탈퇴\n" + " 5. 아이디 존재 체크\n" + " 6. 마이페이지\n" + " 7. 점수 입력";
	public static final String ADMIN_MENU = "0.관리자화면 종료\r" + "1. 회원목록\n" + "2. 아이디검색\n" + "3. 이름검색\n" + "4. 전체 회원수\n"
			+ "5. 성적별 현황";
	public static final String PERSON_SPEC = "아이디: %s 비번: %s 이름: %s";
	public static final String STUDENT_SPEC = "아이디: %s 비번: %s 이름(%s): 주민번호(%s) %s 점수: %d";
	public static final String ADMIN_SPEC = "관리자 아이디: %s 비번: %s 이름: %s 등급: %d";
}

class Person {
	protected String userid, password, name, changepassword;

	String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChangepassword() {
		return changepassword;
	}

	public void setChangepassword(String changepassword) {
		this.changepassword = changepassword;
	}

	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s", userid, password, name);
	}

}

class Student extends Person {
	private String gender,temp;
	
	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	private int ssn, score;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s 주민번호: %d 성별: %s", userid, password, name, ssn, gender);
	}

}

class Admin extends Person {
	private int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s 등급: %d", userid, password, name, rank);
	}

}

interface PersonService {
	/** 1.회원가입 */
	public void join(Student student);

	/** 2.로그인 */
	public String login(Student student);

	/** 3.비번수정 */
	public String changePassword(Student student);

	/** 4.회원탈퇴 */
	public String withdrawal(Student student);

	/** 5.아이디존재체크 */
	public String idSearch(String id);

	/** 6.마이페이지 */
	public String myPage(Student student);

	/** 7.점수입력 */
	public void scoreScan(Student student);

	/* 관리자 메뉴 */
	/** 1.회원목록 */
	public Person[] list();

	/** 2.아이디검색 */
	public Student[] idFind(String idfind);

	/** 3.이름검색 */
	public Student[] nameSearch(String name);

	/** 4.전체 회원수 */
	public int count();

	/** 5.성적별 현황 */
	public Student[] rank();
	//

}

class personServiceImpl implements PersonService {
	private Student[] students;
	private int count;

	public personServiceImpl() {
		students = new Student[5];
		count = 0;

	}

	@Override // 1.회원가입
	public void join(Student student) {
		students[count] = student;
		count++;
	}

	@Override // 2.로그인
	public String login(Student student) {
		String result = "아이디,혹은 비밀번호가 틀렸습니다.";
		for (int i = 0; i < count; i++) {
			if (student.getUserid().equals(students[i].getUserid())
					&& student.getPassword().equals(students[i].getPassword())) {
				result = "로그인되었습니다.";
			}
		}
		return result;
	}

	@Override // 3.비밀번호 변경
	public String changePassword(Student student) {
		String result = "아이디,혹은 비밀번호가 틀렸습니다.";
		for (int i = 0; i < count; i++) {
			if (student.getUserid().equals(students[i].getUserid())
					&& student.getPassword().equals(students[i].getPassword())) {
				students[i].setPassword(student.getChangepassword());
				result = student.getChangepassword() + "로 변경되었습니다";
			}
		}
		return result;
	}

	@Override // 4.회원탈퇴
	public String withdrawal(Student student) {
		String result = "아이디,혹은 비밀번호가 틀렸습니다.";
		{
			for (int i = 0; i < count; i++) {
				if (student.getUserid().equals(students[i].getUserid())
						&& student.getPassword().contentEquals(students[i].getPassword())) {
					students[i] = students[count - 1];
					students[count - 1] = null;
					count--;
					result = "탈퇴되었습니다.";
					break;
				}
			}
		}
		return result;
	}

	@Override // 5.아이디검색
	public String idSearch(String id) {
		String result = "중복없는 아이디입니다.";
		{
			for (int i = 0; i < count; i++) {
				if (id.equals(students[i].getUserid()))
					;
				{
					result = "중복된 아이디입니다.";
					break;
				}
			}
		}
		return result;
	}

	@Override // 6.마이페이지
	public String myPage(Student student) {

		return null;
	}

	@Override // 7.점수입력
	public void scoreScan(Student student) {
		for (int i = 0; i < count; i++) {
			if (student.getUserid().equals(students[i].getUserid())
					&& student.getPassword().equals(students[i].getPassword())) {
				students[i].setScore(student.getScore());
			}
		}
	}

	@Override // 1.회원 목록
	public Person[] list() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override // 2.아이디검색
	public Student[] idFind(String idfind) {
		int cnt = 0;
		int a = 0;
		for (int i = 0; i < count; i++) {
			cnt++;
		}
		Student[] temp = new Student[cnt];
		for (int i = 0; i < cnt; i++) {
			if (idfind.equals(students[i].getName())) {
				temp[a] = students[i];
				a++;
				if (a == cnt) {
					break;
				}
			}
		}
		return temp;
	}

	@Override // 3.이름검색
	public Student[] nameSearch(String name) {
		int cnt = 0;
		int a = 0;
		for (int i = 0; i < count; i++) {
			cnt++;
		}
		Student[] tempp = new Student[cnt];
		for (int i = 0; i < cnt; i++) {
			if (name.equals(students[i].getName())) {
				tempp[a] = students[i];
				a++;
				if (a == cnt) {
					break;
				}
			}
		}
		return tempp;
	}

	@Override // 4.전체 회원수
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override // 5.성적나열
	public Student[] rank() {
		Student[] arr = new Student[count];
		Student temp = new Student();
		int j = 0;
		for (int i = 0; i < count; i++) {
			arr[i] = students[i];
		}
		for (int i = 0; i < count; i++) {
			for (j = 0; j < count - 1; j++)
				;
			{
				if (students[i].getScore() < students[j].getScore()) {
					temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			}
		}

		return students;
	}
}

public class PersonApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = null;
		PersonService service = new personServiceImpl();
		while (true) {
			System.out.println(Constants.MAN_MENU);
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("시스템을 종료합니다");
				return;
			case 1:
				studentMain(scanner, student, service);
				break;
			case 2:
				adminMain(scanner, service);
				break;
			default:
				break;
			}
		}
	}

	public static void studentMain(Scanner scanner, Student student, PersonService service) {
		System.out.println(Constants.STUDENT_MENU);
		String result = "";
		switch (scanner.nextInt()) {
		case 0:
			System.out.println("종료됩니다.");
			return;
		case 1:// 회원가입
			student = new Student();
			System.out.println("회원가입");
			System.out.println("아이디: ");
			student.setUserid(scanner.next());
			System.out.println("비밀번호: ");
			student.setPassword(scanner.next());
			System.out.println("이름: ");
			student.setName(scanner.next());
			System.out.println("주민번호");
			student.setSsn(scanner.nextInt());
			System.out.println("성별");
			student.setGender(scanner.next());
			service.join(student);
			break;
		case 2:// 로그인
			student = new Student();
			System.out.println("로그인");
			System.out.println("아이디: ");
			student.setUserid(scanner.next());
			System.out.println("비밀번호: ");
			student.setPassword(scanner.next());
			result = service.login(student);
			break;
		case 3:// 비번수정
			student = new Student();
			System.out.println("비번수정");
			System.out.println("아이디: ");
			student.setUserid(scanner.next());
			System.out.println("원래 비밀번호: ");
			student.setPassword(scanner.next());
			System.out.println("변경할 비밀번호: ");
			student.setChangepassword(scanner.next());
			result = service.changePassword(student);
			System.out.println(result);
			break;
		case 4:// 회원탈퇴
			student = new Student();
			System.out.println("회원탈퇴");
			System.out.println("아이디: ");
			student.setUserid(scanner.next());
			System.out.println("비밀번호: ");
			student.setPassword(scanner.next());
			result = service.withdrawal(student);
			System.out.println(result);
			break;
		case 5:// 아이디 존재여부 확인
			student = new Student();
			System.out.println("아이디 존재여부 확인");
			System.out.println("아이디: ");
			result = service.idSearch(scanner.next());
			System.out.println(result);
			break;
		case 6:// 마이페이지
			student = new Student();
			System.out.println("마이페이지");
			break;
		case 7:// 점수입력
			student = new Student();
			System.out.println("점수입력");
			System.out.println("아이디: ");
			student.setUserid(scanner.next());
			System.out.println("비밀번호: ");
			student.setPassword(scanner.next());
			System.out.println("점수: ");
			student.setScore(scanner.nextInt());
			service.scoreScan(student);
			break;
		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
	}

	public static void adminMain(Scanner scanner, PersonService service) {
		System.out.println(Constants.ADMIN_MENU);
		switch (scanner.nextInt()) {
		case 0:// 회원메뉴로
			System.out.println("회원메뉴로 돌아갑니다.");
			return;
		case 1:// 1.회원목록
			System.out.println("회원 목록");
			Person[] list = service.list();
			int count = service.count();
			for (int i = 0; i < count; i++) {
				System.out.println(list[i].toString());
			}
			break;
		case 2:// 2.아이디검색
			System.out.println("이름검색");
			System.out.println("검색할 아이디를 입력하세요.");
			Student[] temp = service.idFind(scanner.next());
			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i].toString());
			}
			break;
		case 3:// 3.이름검색
			System.out.println("이름검색");
			System.out.println("검색할 이름을 입력하세요.");
			Student[] tempp = service.nameSearch(scanner.next());
			for (int i = 0; i < tempp.length; i++) {
				System.out.println(tempp[i]);
			}
			break;
		case 4:// 4.전체회원수
			System.out.println("전체 회원수");
			count = service.count();
			System.out.println(count);
			break;
		case 5:// 5.성적별 현황(스코어 기준 이름 내림차순)
			System.out.println("성적별 현황");
			count = service.count();
			Student[] students = service.rank();
			for (int i = 0; i < count; i++)
				System.out.printf("%s등 %s점, 이름: %s 아이디: %s\r", i + 1, students[i].getScore(), students[i].getName(),
						students[i].getUserid());
			break;
		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
	}
}
