package Aula02;

public class boom {
	
	public static String retBoom(int n) {
		if(n == 0)
			return "boom!!";
		return n + retBoom(n-1);
	}
	
	public static void main(String[] args) {

		System.out.println(boom.retBoom(3));
		System.out.println(boom.retBoom(5));
		
	}

}
