package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
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
	public String idFind(String id) {
		String result = "중복없음";
		for (int i = 0; i < count; i++) {
			if (id.equals(members[i].getUserid())) {
				result = "중복된 아이디";
			}
		}
		return result;
	}

	@Override
	public String withdrawal(Member member) {
		String result = "아이디,혹은 비밀번호가 틀렸습니다.";
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;
			}
			result = "탈퇴되었습니다.";
		}
		return result;
	}

	@Override
	public String changePassword(Member member) {
		String result = "아이디,혹은 비밀번호가 틀렸습니다.";
		String changePassword;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				System.out.println("아이디: " + members[i].getUserid());
				changePassword = member.getchangePassword();
				members[i].setPassword(member.getchangePassword());// 보안이 들어갈때
				result = member.getchangePassword() + "로 변경되었습니다.";

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
	public Member[] nameFind(String name) {
		int cnt = 0; // 동명이인의 수
		int a = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				cnt++;
			}
		}
		Member[] temp = new Member[cnt];
		for (int i = 0; i < cnt; i++) {
			if (name.equals(members[i].getName())) {
				temp[a] = members[i];
				a++;
				if (a == cnt) {
					break;
				}
			}
		}
		return temp;
	}

	@Override
	public int count() {
		return count;
	}
}
