package Aula1;

public class Main1 {
	public static void main(String[] args) {
		int vet[] = {5, 7, 2, 8, 1};
		BubbleSort b = new BubbleSort();
		b.sort(vet);
		b.print(vet);
		
		System.out.println();
		
		int vet2[] = {5, 7, 2, 8, 1};
		SelectionSort s = new SelectionSort();
		s.sort(vet2);
		s.print(vet2);
		
	}

}
