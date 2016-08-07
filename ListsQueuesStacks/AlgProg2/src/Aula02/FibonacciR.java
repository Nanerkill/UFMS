package Aula02;

public class FibonacciR {
	
	public static int nFib(int n) {	
		if(n < 2)
			return n;
		return nFib(n-1) + nFib(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(FibonacciR.nFib(4));
	}

}
