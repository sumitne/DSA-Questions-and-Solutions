package Recursion;

// Recursion when Stack is building
public class Problem1 {
public static void print(int n) {
	
	if(n==0) {  // base case i.e the state where the function should stop calling itself
		return;
	}
	System.out.println(n);
	print(n-1);
}
public static void main(String args[]) {
	print(5);
}
}
