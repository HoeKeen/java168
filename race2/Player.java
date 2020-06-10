package race2;
public class Player {
	private String name;
	private int record;
	
	public void setName(String name){
		this.name=name;}
	public String getName() {
		return this.name;}
	public void setRecord(int record) {
		this.record=record;}
	public int getRecord() {
		return this.record;
	}
	public void state() {
	System.out.println(name+"님의 기록은 :"+record
			+"초입니다.");
	}
}
	
