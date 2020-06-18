package member; //메소드를 등록하는곳 (메뉴판에 추가) 클라이언트를 위해 주는 개념

public interface MemberService {
	//1.회원가입
	public void join(Member member);
	//2.로그인
	public String login(Member member);
	//3.회원목록
	public Member[] list(); //Member 클래스의 member에서 불러옴
	//4.아이디 중복체크
	public String idFind(String id);
	//5.비번수정
	public String changePassword(Member member);
	//6.회원탈퇴
	public String withdrawal (Member member);
	//7.아이디 검색
	//미구현
	//8.이름검색 (동명이인 처리필요)
	public Member[] nameFind(String name);
	//9.전체 회원수=회원가입된 계정의 수
	public int count();
	
	//public String showinfo(Member member);
	
}

