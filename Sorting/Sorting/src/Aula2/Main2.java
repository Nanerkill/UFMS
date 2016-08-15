package Aula2;

public class Main2 {
	public static void main(String[] args) {
		
		System.out.println("InserctionSort Test");
		int vet[] = {5, 7, 2, 8, 1};
		InserctionSort b = new InserctionSort();
		b.sort(vet);
		b.print(vet);
		
		System.out.println();
		
		System.out.println("Test MergeSort");
		int vet2[] = {5, 7, 2, 8, 1};
		MergeSort merge = new MergeSort();
		merge.sort(vet2);
		merge.print(vet2);
	}

}
