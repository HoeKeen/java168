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
	public String idFind(Member member) {
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
				for (int j = 0; j < count; j++) {
					members[i] = members[count - 1];

				}
				members[count - 1] = null;
				count--;
			}
		}
		return result;
	}

	@Override
	public String changePassword(Member member) {
		String result = "비밀번호가 틀렸습니다.";
		String changePassword;
		for (int i = 0; i < count; i++) {
			if (member.getPassword().equals(members[i].getPassword())) {
				System.out.println("아이디: " + members[i].getUserid());
				result = member.getchangePassword() + "로 변경되었습니다.";
				changePassword = member.getchangePassword();
				members[i].setPassword(member.getchangePassword());
			}
		}
		return result;
	}

	@Override
	public Member[] list() {
// TODO Auto-generated method stub
		return members;
	}

	@Override
	public int count() {
		return this.count;
	}

	@Override
	public Member[] nameFind(Member member) {
		Member[] namE=null;
		for (int i = 0; i < count; i++) {
			if (member.getName().equals(members[i].getName())) {
				namE[i]=members[i];
			}
		}
		return namE;
	}
}