package Aula05;
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue();
		
		int ans = 0;
		
		while((ans = sc.nextInt()) != -1) {
			q.enqueue(ans);
		}
		
		int x = (q.size())/2;
		while(x-- != 0)
			q.dequeue();
		System.out.println(q);
		
	}

}
