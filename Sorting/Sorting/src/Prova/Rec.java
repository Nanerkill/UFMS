package meh;

public class Rec {
	
	public static int recursivePow(int x, int n) {
		if(n == 0)
			return 1;
		return x * recursivePow(x, --n);
	}
	
	public static void main(String[] args) {
		int x = Rec.recursivePow(5, 2);
				System.out.println(x);
	}

}
