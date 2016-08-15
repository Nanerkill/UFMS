package Uri;

import java.util.Scanner;

public class Habay2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String vet[];
		String biggest = "";
		boolean add = false;
		String YES[] = new String[1];
		String NO[] = new String[1];
		int contYES = 0;
		int contNO = 0;

		while (!(input).equals("FIM")) {
			add = true;
			vet = input.split(" ");
			
			if(vet[1].equals("NO")) {
				for (int i = 0; i < NO.length && add; i++) {
					if (NO[0] != null)
						if (NO[i].equals(vet[0]))
							add = false;
				}
				
				if (add) {
					if (contNO == NO.length)
						NO = resize(NO);
					NO[contNO++] = vet[0];
					add = false;
				}
			}

			else if (vet[1].equals("YES")) {
				if (vet[0].length() > biggest.length()) // put inside // add
					biggest = vet[0];
				
				for (int i = 0; i < YES.length && add; i++) {
					if (YES[0] != null)
						if (YES[i].equals(vet[0]))
							add = false;
				}
				
				if (add) {
					if (contYES == YES.length)
						YES = resize(YES);
					YES[contYES++] = vet[0];
				}
			}
					
			input = sc.nextLine();
		}

			


		sort(YES);
		sort(NO);

		for (String x : YES)
			System.out.println(x);
		for(String x: NO)
			System.out.println(x);
		System.out.println();

		System.out.println("Amigo do Habay:");
		System.out.println(biggest);

	}

	public static String[] resize(String[] vet) {
		String newVet[] = new String[vet.length + 1];
		int i = 0;
		for (String x : vet)
			newVet[i++] = x;
		return newVet;
	}

	public static void sort(String[] vet) {

		for (int i = 0; i < vet.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j].charAt(0) < vet[min].charAt(0))
					min = j;
			}
			if (min != i)
				swap(vet, i, min);
		}

	}

	public static void swap(String[] vet, int p1, int p2) {
		String aux = vet[p1];
		vet[p1] = vet[p2];
		vet[p2] = aux;
	}

}
