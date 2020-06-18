package one;

import java.util.Scanner;

/**
 * @author soriheda06@gmail.com
 * @since 2020.06.18
 * @param kind 종류, company 제조사, call 통화내역 
 */
class Product{
	
}

class TV extends Product{
	public final static String KIND ="TV";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	}
}

class ColorTv extends TV{
	public final static String KIND ="ColorTv";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	}
}

class Computer extends Product{
	public final static String KIND ="Computer";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	}
}
class Notebook extends Computer {
	public final static String KIND ="Notebook";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	}
}


class BelPhone  extends Product{
	protected String kind, company, call;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "집전화기[폰종류=" + kind + ", 제조사=" + company + ", 통화내역=" + call + "]";
	}

}

class CelPhone extends BelPhone {
	public final static String KIND = "휴대폰";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {

		move = (portable) ? "이동중에 " : "이동불가능"; // (오브젝트를)? 트루일때:펄스일때;
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return String.format("%s인  %s제품을 사용해서  %s 라고 %s 통화한다.", 
				KIND, company, call, this.move); // this는 생략 가능
	}

}

class Iphone extends CelPhone {
	public final static String KIND = "아이폰";
	protected String search;
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	@Override
	public String toString() {
		return String.format("%s", 
				KIND); //super가 있으면 바로 위에 클래스에서 호출
	}

	//[애플] 아이폰을 사용해서 이동중에 [뉴스 검색]을   한다.
}

class GalPhone extends Iphone{
	public final static String KIND = "갤럭시";
	protected String pay;
	
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return String.format("%s", 
				KIND); //super가 있으면 바로 위에 클래스에서 호출
	}
	//[삼성] 갤럭시 제품을 사용해서, [이동]중에 [삼성페이결제] 한다
	
}



public class Etland {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product item = null;
		Product[] cart = new Product[5];
		int index = 0;
		CelPhone cel = null;
		Iphone iphone = null;
		GalPhone galphone = null;
		while (true) {
			System.out.println("쇼핑목록 : 0.종료 1.아이폰 2.갤럭시 3.컬러TV "+"\r"+
					 "4.컴퓨터 5.노트북 6. 쇼핑목록보기");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1:
				cart[index] = new Iphone();
				index++;
				break;
			case 2:
				cart[index] = new GalPhone();
				index++;
				break;
			case 3:
				cart[index] = new ColorTv();
				index++;
				break;
			case 4:
				cart[index] = new Computer();
				index++;
				break;
			case 5:
				cart[index] = new Notebook();
				index++;
				break;
			case 6:
				for(Product p : cart)
				{
				System.out.println(p.toString());
				}
				break;
			default:
				break;
			}
		}
}
}