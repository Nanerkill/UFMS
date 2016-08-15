package Uri;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n != 0) {
			int cont = 0;
			boolean[] vet = new boolean[n];
			int k;
			for(int i = 0; i < n; i++)
				if((k = sc.nextInt()) > 0)
					vet[i] = true;
				else
					vet[i] = false;
			
			boolean vet2[] = new boolean[vet.length*2];
			
			int i = 0;
			for(boolean x: vet)
				vet2[i++] = x;
			
			int l = 2;
			for(boolean x: vet)
				vet2[l++] = x;
			
			for(int j = 1; j < vet2.length-1; j++) {
				if(vet2[j] == true && vet2[j-1] == false && vet2[j+1] == false)
					cont++;
			}
			
			
			
			System.out.println(cont*2);
			
			n = sc.nextInt();
		}
		
		
	}

}
