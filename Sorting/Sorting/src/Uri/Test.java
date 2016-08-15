package Uri;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String vet[] = {"Renan", "Otavio", "Luciane", "Carlos"};
		
		for(String x: vet)
			System.out.printf(x + " ");
		
		Arrays.sort(vet);
		
		System.out.println();
		for(String x: vet)
			System.out.printf(x + " ");
		
	}

}
