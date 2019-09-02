package a1;

import java.util.ArrayList;
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
		ArrayList<ArrayList<String>> num_per = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < num_item;i++) {
			num_per.add(new ArrayList<String>());
		}
		int[] buy_item = new int[num_item];
		
		for(int i = 0; i < num_cus;i++) {
			f[i] = scan.next();
			l[i] = scan.next();
			int per_cus = scan.nextInt();
			for(int j = 0; j < per_cus;j++) {
				int quan = scan.nextInt();
				String name = scan.next();
				for(int k = 0;k < item_name.length;k++) {
					if (item_name[k].equals(name)) {
						if (!(num_per.get(k).contains(f[i] + l[i]))) {
							num_per.get(k).add(f[i] + l[i]);
						}
						buy_item[k] += quan;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < num_item;i++) {
			if (num_per.get(i).size() == 0) {
				System.out.println("No customers bought " + item_name[i]);
			}
			else {
				System.out.println(num_per.get(i).size() + " customers bought " + buy_item[i] + " " + item_name[i]);
			}
		}
	}
}
