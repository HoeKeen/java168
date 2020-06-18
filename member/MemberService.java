package member; //메소드를 등록하는곳 (메뉴판에 추가) 클라이언트를 위해 주는 개념

public interface MemberService {
	public Member[] list(); //Member 클래스의 member에서 불러옴
	public void join(Member member);
	public String login(Member member);
	public String changePassword(Member member);
	public String withdrawal (Member member);
	public String idFind(Member member);
	public Member[] nameFind(Member member);
	public int count();
	
	//public String showinfo(Member member);
	
}

