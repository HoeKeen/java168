package member; //메소드를 등록하는곳 (메뉴판에 추가) 클라이언트를 위해 주는 개념

public interface MemberService {
	public Member[] list(); //Member 클래스의 member에서 불러옴
	public void join(Member member);
	public String login(Member member);
	public String changePassword(Member member);
	public String withdrawal (Member member);
	public String idfind(Member member);


	public int count();
	
	//public String showinfo(Member member);
	
}

/*
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 */