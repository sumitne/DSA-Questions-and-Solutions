package Recursion;

public class Fibonacci2 {
	public static void main(String args[]) {
		int i=0;
		while(i<5) {
		System.out.println(Fibonacci(i));
		i++;
		}
	}
	public static int Fibonacci(int n)
	{	
		if(n==0||n==1) return n;
		return (Fibonacci(n-1)+Fibonacci(n-2));
	
	}
}
