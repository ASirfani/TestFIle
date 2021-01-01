import java.util.Scanner;

public class TestLab2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please eneter the description: ");
		String description = scan.nextLine();
		
		System.out.print("Please eneter the price: ");
		int price = scan.nextInt();
		
		System.out.print("Please enter the quantity: ");
		int quantity = scan.nextInt();
		
		// object of Stock Item
		StockItem item = new StockItem(description, price, quantity);
		System.out.println(item.toString());
		
		// add method
		System.out.println("\nAfter adding Quantity: '12'");
		item.addQuantity(12);
		System.out.println(item.toString());
		
		// removing method
		System.out.println("\nAfter removing Quantity: '34'");
		item.removeQuantity(34);
		System.out.println(item.toString());
		
		
	
	}

}
