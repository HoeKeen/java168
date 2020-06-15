package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[3];
		count = 0;
	}

	@Override
	public void join(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public String login(Member member) {
		String result = "FAIL";
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				result = "SUCCESS";
				break;
			}
		}
		return result;
	}

	@Override
	public String idfind(Member member) {
		String result = "중복없음";
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				result = "중복된 아이디";
			}
		}
		return result;
	}

	@Override
	public String withdrawal(Member member) {
		String result = "탈퇴되었습니다.";
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i].getUserid().equals(null);
				members[i].getPassword().equals(null);
				members[i].getName().equals(null);
				count--;
				break;
			}
		}
		return result;
	}

	@Override
	public String changePassword(Member member) {
		String result = "잘못된 비밀번호입니다.";
		for (int i = 0; i < count; i++) {
			if (member.getPassword().equals(members[i].getPassword())) {
				System.out.println("아이디: " + members[i].getUserid());
				System.out.println("변경할 비밀번호: "+member.getchangePassword());
				members[i].getPassword().equals(member.getchangePassword());
				result = "변경되었습니다.";
				break;
			}else {System.out.println("잘못된 비밀번호입니다.");
		}
	}
		return result;
}

	@Override
	public Member[] list() {
		// TODO Auto-generated method stub
		return null;
	}
}