package Recursion;

public class Power {
	public static void main(String args[]) {
		System.out.print(Power(2,10));
		
	}
	public static int Power(int x, int y) {
		if(y==0) return 1;
		
		return x * Power(x, y-1);
		
	}
}
