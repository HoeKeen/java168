package member;

import java.util.Scanner;

import race.Player;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		MemberService memberService = new MemberServiceImpl();
		while (true) {
			System.out.println("메뉴\r0.종료 1.회원가입 2.로그인 3.회원목록 4.아이디 중복 체크\r" + 
							"5.비번 수정 6.회원 탈퇴 7.아이디 검색 8.이름검색 9.전체 회원수");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1: //1.회원가입
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				System.out.println("이름: ");
				member.setName(scanner.next());
				memberService.join(member);
				break;
			case 2: //2.로그인
				System.out.println("로그인");
				member = new Member();
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				String result = memberService.login(member);
				System.out.println(result);
				break;
			case 3: //3.회원목록
				System.out.println("목록보기");
				Member[] list = memberService.list();
				int count = memberService.count();
				System.out.println("회원수 :" + count);
				for (int i = 0; i < count; i++) {
					System.out.println(list[i].toString());
				}
				break;
			case 4: //4.아이디 중복 체크
				System.out.println("아이디 중복 체크");
				break;
			case 5: //5.비번 수정
				member = new Member();
				System.out.println("비밀번호 수정");
				System.out.println("원래 비밀번호를 입력해주세요.");
				member.setPassword(scanner.next());
				System.out.println("수정할 비밀번호를 입력해주세요.");
				member.setchangePassword(scanner.next());
				result = memberService.changePassword(member);
				System.out.println(result);
				break;	
			case 6: //6.회원 탈퇴
				member = new Member();
				System.out.println("회원 탈퇴");
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				result = memberService.withdrawal(member);
				System.out.println(result);
				break;
			case 7: //7.아이디 검색
				System.out.println("아이디 검색");
				member = new Member(); // Member 클래스에서 정보를 가져와 member에 담는다
				System.out.println("검색할 아이디를 입력하세요.");
				member.setUserid(scanner.next());
				result = memberService.idFind(member); // 위에 이미 스트링 리설트, 같은 의미를 반복해서 여기서는 스트링 안써야됨
				System.out.println(result);
				break;
			case 8: //8.이름검색
				member = new Member();
				System.out.println("이름검색");
				System.out.println("검색할 이름을 입력하세요.");
				member.setName(scanner.next());
				Member[] namE = memberService.nameFind(member);
				count = memberService.count();
				for(int i=0;i<count;i++) {
				System.out.println(namE[i]);
				}
				break;
			case 9: //9.전체 회원수
				System.out.println("전체 회원수");
				break;
			default:
				System.out.println("메뉴에 없는 기능입니다.");
				break;
			}
		}
	}
}