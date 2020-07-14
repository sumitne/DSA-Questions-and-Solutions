package Recursion;

public class LastIndex {
	public static void main(String args[]) {
		int[] arr = {4,5,8,6,2,4,5,8,9,12};
		System.out.print(FindLast(arr,0,6));
	}
	static int result=-1;
	static int FindLast(int[] arr, int si, int data) {
		if(si==arr.length) return result;
		if(arr[si] == data) result = si;
		return FindLast(arr,si+1,data);
	}
}
