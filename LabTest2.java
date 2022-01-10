package quiz;

import java.util.Scanner;
public class LabTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sales, hours;
		double commission, wages;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sales        : RM");
		sales = sc.nextInt();
		
		System.out.print("Enter hours worked : ");
		hours = sc.nextInt();
		
		if ((sales >= 150) && (sales <= 300)) {
			commission = sales*0.05;
			wages = (hours*5) + commission;
		}
		
		else if ((sales >= 301) && (sales <= 500)) {
			commission = sales*0.1;
			wages = (hours*5) + commission;
		}
		
		else  {
			commission = sales*0.15;
			wages = (hours*5) + commission;
		}
		
		System.out.println("Commission         : RM"+commission);
		System.out.println("Daily wages        : RM"+wages);
	}

}
