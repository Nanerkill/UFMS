package Aula02;

import java.util.Scanner;

public class NdeA {
	
	public static int nDeA(String a, char c) {
		if(a.length() == 0)
			return 0;
		int cont = (a.charAt(0) == c) ? 1 : 0;
		return cont + nDeA(a.substring(1), c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(NdeA.nDeA(sc.nextLine(), sc.next().charAt(0)));
		
		sc.close();
		
	}

}
