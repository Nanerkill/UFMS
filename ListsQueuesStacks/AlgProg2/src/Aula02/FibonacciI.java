package Aula02;

public class FibonacciI {
	
	/**
	 * Retorna um vetor com a sequencia de fibonacci ate n desejado.
	 * @param
	 * n inteiro da posicao da sequencia que deseja parar.
	 * @return
	 * Vetor inteiro com a sequencia ateh n.
	 */
	public static int[] fibSeq(int n) {
		int[] vet = new int[n];
		for(int i = 0; i < n; i++) {
			if(i < 2)
				vet[i] = i;
			if(i >= 2)
				vet[i] = vet[i-1] + vet[i-2];
		}
		return vet;
	}
	
	public static int nFib(int n) {
		if(n < 2)
			return n;
		else {
			int ret = 0;
			int[] vet = new int[n];
			for(int i = 0; i < n; i++) {
				if(i >= 2)
					vet[i] = vet[i-1] + vet[i-2];
				if(i == n)
					ret = vet[i];
			}
			return ret;
		}
	}
	
	public static void main(String[] args) {
		for(int x : FibonacciI.fibSeq(30))
			System.out.print(x + " ");
		System.out.println();
		System.out.println(FibonacciI.nFib(4));
	}

}
