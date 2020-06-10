package practice;
import java.util.Scanner;
public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] price = new Shop[3];
	for(int i=0;i<price.length;i++)
	{	Shop shop = new Shop();
		System.out.println("이름");
		shop.setName(scanner.next());
		System.out.println("핸드폰");
		shop.setPhone(scanner.nextInt());
		System.out.println("TV");
		shop.setTv(scanner.nextInt());
		System.out.println("컴퓨터");
		shop.setComputer(scanner.nextInt());
		shop.sum();
		price[i]=shop;
	}
	for(int i=0;i<price.length;i++)
		price[i].state();	
	}
}
