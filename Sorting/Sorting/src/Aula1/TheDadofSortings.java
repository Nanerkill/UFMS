package Aula1;

public abstract class TheDadofSortings implements inPlaceSorting {
	
	public void swap(int[] vet, int p1, int p2) {
		int aux = vet[p1];
		vet[p1] = vet[p2];
		vet[p2] = aux;
	}
	
	public void print(int[] vet) {
		for(int x: vet)
			System.out.print(x + " ");
	}

}
