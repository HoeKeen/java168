package test;
import java.util.Scanner;
public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] price = new Shop[3];
	for(int a=0;a<price.length;a++){
		Shop shop = new Shop ();
		System.out.println("이름은??");
		shop.setName(scanner.next());
		System.out.println("핸드폰 가격:");
		shop.setPhone(scanner.nextInt());
		System.out.println("TV 가격");
		shop.setTv(scanner.nextInt());
		System.out.println("컴퓨터 가격");
		shop.setComputer(scanner.nextInt());
		shop.sum();
		price[a] = shop;
		}
	for(int a=0;a<price.length;a++)
			price[a].state();		
	}
}
