package Recursion;

public class FirstIndex {
public static void main(String args[]) {
	int[] arr = {4,5,8,6,2,4,5,8,9,12};
	System.out.print(FindFirst(arr,0,12));
}
	static int FindFirst(int[] arr,int si, int data) {
		if(si==arr.length) return -1;
		if(arr[si]==data) return si;
		else {
			return FindFirst(arr,si+1,data);
		}
	}
}
