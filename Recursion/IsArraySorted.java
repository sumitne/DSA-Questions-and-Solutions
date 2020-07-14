package Recursion;

public class IsArraySorted {
	public static void main(String args[]) {
	int[] arr = {2,3,4,5,6,7,8,44,66};
	System.out.print(isSorted(arr,0));
	}
	static boolean isSorted(int[] arr,int si) {
		if(si==arr.length-1) return true;
		if(arr[si]>arr[si+1]) return false;
		else {
			return isSorted(arr,si+1);
		}
	}

}
