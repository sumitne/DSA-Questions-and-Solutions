package Recursion;

public class Factorial {
	public static void main(String args[]) {
		System.out.print(Fact(6));
	}
	public static int Fact(int n) {
		if(n==1) {
			return 1;
		}
		return  n * Fact(n-1);

	
	}

}
