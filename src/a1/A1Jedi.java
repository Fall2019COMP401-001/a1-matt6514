package a1;

import java.util.Scanner;

public class A1Jedi {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_item = scan.nextInt();
		String[] item_name = new String[num_item];
		double[] item_price = new double[num_item];
		
		for (int i = 0; i < num_item;i++) {
			item_name[i] = scan.next();
			item_price[i] = scan.nextDouble();
		}
		
		int num_cus = scan.nextInt();
		String[] f = new String[num_cus];
		String[] l = new String[num_cus];
		int[] num_per = new int[num_item];
		int[] buy_item = new int[num_item];
		
		for(int i = 0; i < num_cus;i++) {
			f[i] = scan.next();
			l[i] = scan.next();
			int per_cus = scan.nextInt();
			for(int j = 0; j < per_cus;j++) {
				int quan = scan.nextInt();
				String name = scan.next();
				int m = 0; //to keep track of index of fruit
				for(int k = 0;k < item_name.length;k++) {
					if (item_name[k].equals(name)) {
						num_per[k] += 1;
						buy_item[k] += quan;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < num_item;i++) {
			if (num_per[i] == 0) {
				System.out.println("No customers bought " + item_name[i]);
			}
			else {
				System.out.println(num_per[i] + " customers bought " + buy_item[i] + " " + item_name[i]);
			}
		}
	}
}
