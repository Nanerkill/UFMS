package Aula2;

import Aula1.TheDadofSortings;

public class MergeSort extends TheDadofSortings {

	@Override
	public void sort(int[] vet) {
		mergeSort(vet, 0, vet.length-1);
		
	}
	
	public void mergeSort(int vet[], int start, int end) {
		if(start < end) {
			int middle = (start+end)/2;
			mergeSort(vet, start, middle);
			mergeSort(vet, middle+1, end);
			
			merge(vet, start, middle, end);
		}
		
	}
	
	public void merge(int vet[], int start, int middle, int end) {
		int[] b = new int[vet.length];
		
		for(int i = start; i < end; i++)
			b[i] = vet[i];
		
		int i = start;
		int j = middle+1;
		int k = start;
		
		while(i <= middle && j <= end)
			if(b[i] <= b[j])
				vet[k++] = b[i++];
			else
				vet[k++] = b[j++];
		while(i <= middle)
			vet[k++] = b[i++];
		
	}

}
