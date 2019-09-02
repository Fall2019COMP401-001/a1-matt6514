package a1;

import java.util.Scanner;

public class A1Adept {

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
		double[] total = new double[num_cus];
		
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
						m = k;
						break;
					}
				}
				total[i] += quan * item_price[m];
			}
		}
		
		int max_Index = 0;
		int min_Index = 0;
		double sum_total = 0;
		for (int i = 0; i < total.length;i++) {
			sum_total += total[i];
			if (total[i] > total[max_Index]) {
				max_Index = i;
			}
			if (total[i] < total[min_Index]) {
				min_Index = i;
			}
		}
		
		String max_Value = twoDigits(total[max_Index]);
		String min_Value = twoDigits(total[min_Index]);
		String average_Value = twoDigits(sum_total/total.length);
		
		System.out.println("Biggest: " + f[max_Index] + " " + l[max_Index] + " (" + 
				max_Value.substring(0,max_Value.length()-2) + "." + max_Value.substring(max_Value.length()-2,max_Value.length())
				+ ")");
		System.out.println("Smallest: " + f[min_Index] + " " + l[min_Index] + " (" + 
				min_Value.substring(0,min_Value.length()-2) + "." + min_Value.substring(min_Value.length()-2,min_Value.length())
				+ ")");
		System.out.println("Average: " +
				average_Value.substring(0,average_Value.length()-2) + "." + average_Value.substring(average_Value.length()-2,average_Value.length())
				);
	}
	
	public static String twoDigits(double num) {
		String cor = Integer.toString((int)Math.round(num*100));
		if (cor.length() < 3) {
			if (cor.length() < 2) {
				cor = "00" + cor;
			} 
			else {
				cor = "0" + cor;
			}
		}
		return(cor);
	}
}
