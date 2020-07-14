package Recursion;
import java.util.ArrayList;
public class AllIndices {

	public static void main(String[] args) {
		int[] arr = {1,8,2,53,8,3,5,7,8,90,8};
		System.out.print(allIndices(arr,0,8));

	}
	 static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> allIndices(int[] arr,int si, int data) {
		if(si==arr.length) return list;
		if(arr[si] == data) list.add(si);
		return allIndices(arr,si+1,data);
	}

}
