package quiz;

import java.util.Scanner;
public class LabTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numItem, total, discount, pay;
		double item1, item2, item3;
		int quan1, quan2, quan3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		numItem = sc.nextDouble();
		
		System.out.print("Enter the price of first item: RM");
		item1 = sc.nextDouble();
		
		System.out.print("Enter the quantity of first item: ");
		quan1 = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Enter the price of second item: RM");
		item2 = sc.nextDouble();
		
		System.out.print("Enter the quantity of second item: ");
		quan2 = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Enter the price of third item: RM");
		item3 = sc.nextDouble();
		
		System.out.print("Enter the quantity of third item: ");
		quan3 = sc.nextInt();
		
		System.out.println("");
		
		total = (item1*quan1) + (item2*quan2) + (item3*quan3);
		System.out.println("Total price           :RM"+total);
		
		if (total > 100) {
		discount = total*0.2;
		pay = total - discount;
		System.out.println("Discount received     :RM"+discount);
		System.out.println("Price to be paid      :RM"+pay);
	
	}
		else {
			System.out.println("Discount received     :RM00.00");
		    System.out.println("Price to be paid      :RM"+total);
		}
	}
}
