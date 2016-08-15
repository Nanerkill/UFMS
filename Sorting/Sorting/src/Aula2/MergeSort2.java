package Aula2;

public class MergeSort2 {
	private static int[] vet = {9, 9, 7, 1, 3, 5, 10};
	private static int[] vetTemp = new int[vet.length];
	
	public static void main(String[] args) {
		merge(0,vet.length-1);
		System.out.println(toString(vet));
	}
	
	public static String toString(int[] vet) {
		String resp = "";
		for (int i = 0; i < vet.length; i++)
			resp += vet[i] + " ";
		return resp;		
	}

	public static void merge(int inicio, int fim) {
		if (inicio < fim) {
			int meio = inicio + (fim - inicio)/2;
			merge(inicio, meio);
			merge((meio + 1), fim);
			partes(inicio, meio, fim);
		}
	}

	private static void partes(int inicio, int meio, int fim) {
		for(int i = inicio; i <= fim; i++)
			vetTemp[i] = vet[i];
		int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (vetTemp[i] <= vetTemp[j]) {
                vet[k] = vetTemp[i];
                i++;
            } else {
                vet[k] = vetTemp[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            vet[k] = vetTemp[i];
            k++;
            i++;
        }
    }
	
}