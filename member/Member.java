package member;

public class Member {
	private String userid;
	private String password;
	private String name;
	private String change;
	private String[] namE;
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return this.userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setchangePassword(String change) {
		this.change = change;
	}
	public String getchangePassword() {
		return this.change;
	}
	public String toString() {
		return "[아이디: "+userid+", 비번: "+password+", 이름: "+name+"]";
	}
}
