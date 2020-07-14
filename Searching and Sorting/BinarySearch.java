package DSA;
import java.util.Scanner;
// for binary search array should be sorted 
public class BinarySearch {
	static int binary(int arr[], int item) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<item) {
				low = mid+1;
		
			}
			else if(arr[mid]>item) {
				high = mid-1;
				
			}                                     //complexity O(logbase2 N) >> log(n)
			else {
				return mid;
			}
		}
		return -1;
	
	}
	public static void main(String args[]) {
		int arr[] = {10,15,20,30,35,40,45,50,55,60}; // creating a sorted array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to search :");
		int item = sc.nextInt();
		int index = binary(arr,item);
		System.out.println(index);
	}
}
