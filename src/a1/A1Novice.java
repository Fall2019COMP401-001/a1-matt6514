package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_cus = scan.nextInt();
		
		for (int i = 0; i < num_cus;i++) {
			System.out.print(scan.next().substring(0,1) + ". ");
			System.out.print(scan.next() + ": ");
			int num_item = scan.nextInt();
			double total_price = 0.0;
			for (int j = 0;j < num_item;j++) {
				int quan = scan.nextInt();
				String name = scan.next();
				total_price += quan * scan.nextDouble();
			}
			String total = Integer.toString((int)Math.round(total_price*100));
			if (total.length() < 3) {
				if (total.length() < 2) {
					total = "00" + total;
				} 
				else {
					total = "0" + total;
				}
			}
			System.out.println(total.substring(0,total.length()-2) + "." + total.substring(total.length()-2,total.length()));
		}
		
		
	}
}
