package Recursion;

public class Problem4 {
public static void main(String args[]) {
	print(5);
}
public static void print(int n){
	if(n==0) return;
	if(n%2==1) {
	System.out.println(n);
	}
	print(n-1);
	if(n%2==0) {
	System.out.println(n);
	}
}
}
