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
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				result = "중복된 아이디";
			}
		}
		return result;
	}

	/*
	 * String id_find = "없는 아이디입니다."; for (int i = 0; i < count; i++) { if
	 * (member.getUserid().equals(members[i].getUserid())) id_find =
	 * "이미 있는 아이디입니다."; break; } return id_find; }
	 */

	@Override
	public Member[] list() {
		return members;
	}
}