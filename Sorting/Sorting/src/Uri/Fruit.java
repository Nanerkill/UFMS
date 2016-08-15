package Uri;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double total = 0, listTotal = 0;
		String list[];
		for(int i = 1; i < n+1; i++) {
			
			total += sc.nextDouble();
			sc.nextLine();
			list = sc.nextLine().split(" ");
			listTotal += list.length;
			
			System.out.printf("day %d: %d kg\n", i, list.length);
			
		}
		
		System.out.printf("%.2f kg by day\n", listTotal/n);
		System.out.printf("R$ %.2f by day\n", total/n);
		
	}

}
