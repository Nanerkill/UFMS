package Aula1;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("BubbleSort Test");
		int vet[] = {5, 7, 2, 8, 1};
		BubbleSort b = new BubbleSort();
		b.sort(vet);
		b.print(vet);
		
		System.out.println();
		
		System.out.println("SelectionSortTest");
		int vet2[] = {5, 7, 2, 8, 1};
		SelectionSort s = new SelectionSort();
		s.sort(vet2);
		s.print(vet2);
		
	}

}
