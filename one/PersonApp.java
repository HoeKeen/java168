package one;

import java.util.Scanner;


/*RPF
Psreson(id,pass,name:String)
 - Student(ssn:String(주민번호),score:int),
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

class Person {
	private String userid, password, name, changepassword;

	public String getChangepassword() {
		return changepassword;
	}

	public void setChangepassword(String changepassword) {
		this.changepassword = changepassword;
	}

	public String getUserid() {
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
	
	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s",userid, password, name);
	}

}

class Student extends Person {
	private String ssn;
	private int score;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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

}

class PersonService extends Person{
	public void join(Person person);
	
}

class PersonAppImpl extends PersonService{ 
	private Person[] persons
	
	persons = new Person[3];
	
	public String join{
		result = "가입되었습니다.";
			
		
	}
}


public class PersonApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person person =null;
		PersonAppImpl personAppImpl = new PersonAppImpl();
		while (true) {
			System.out.println("메뉴");
			System.out.println("0.종료 1.회원가입 2.로그인 3.비번수정 4.회원탈퇴 5.아이디 존재 체크\r" 
							 + "6.마이페이지 7.점수입력 8.관리자기능");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료됩니다.");
				return;
			case 1:// 회원가입
				person = new Person();
				System.out.println("회원가입");
				System.out.println("아이디: ");
				person.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				person.setPassword(scanner.next());
				String result = PersonAppImpl.join(person);
				System.out.println(result);
				break;
			case 2:// 로그인
				person = new Person();
				System.out.println("로그인");
				System.out.println("아이디: ");
				person.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				person.setPassword(scanner.next());
				break;
			case 3:// 비번수정
				person = new Person();
				System.out.println("비번수정");
				System.out.println("아이디: ");
				person.setUserid(scanner.next());
				System.out.println("원래 비밀번호: ");
				person.setPassword(scanner.next());
				System.out.println("변경할 비밀번호: ");
				person.setChangepassword(scanner.next());
				break;
			case 4:// 회원탈퇴
				person = new Person();
				System.out.println("회원탈퇴");
				System.out.println("아이디: ");
				person.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				person.setPassword(scanner.next());
				break;
			case 5:// 아이디 존재여부 확인
				person = new Person();
				System.out.println("아이디 존재여부 확인");
				System.out.println("아이디: ");
				break;
			case 6:// 마이페이지
				person = new Person();
				System.out.println("마이페이지");
				break;
			case 7://점수입력
				person = new Person();
				System.out.println("점수입력");
				System.out.println("아이디: ");
				person.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				person.setPassword(scanner.next());
				System.out.println("점수: ");
				break;
			case 8:
				System.out.println("관리자기능 ");
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}

	}
}