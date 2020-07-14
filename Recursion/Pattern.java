package Recursion;

public class Pattern {
public static void main(String args[]) {
	Pattern(5,1,1);
}
static void Pattern(int n,int row, int col) {
	if(row>n) return;
	if(col>row) {
		System.out.println();
		Pattern(n,row+1,1);
		return;
	}
	System.out.print("*");;
	Pattern(n,row,col+1);

	
}
}
