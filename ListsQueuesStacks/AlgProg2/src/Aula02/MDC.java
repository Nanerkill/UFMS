package Aula02;

public class MDC {
	
	private static int bigger;
	
	public static int MDC(int n, int m) {
		bigger = (n > m) ? n : m;
		
		return 0;
	}

}
