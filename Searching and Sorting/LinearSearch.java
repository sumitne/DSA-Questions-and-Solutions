package DSA;
import java.util.Scanner;
public class LinearSearch {
	static int linear(int arr[] , int item) {
		for(int i=0 ; i<arr.length ;i++) {
			if(arr[i] == item) {
				return i;
			}
			
		}
			return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to search ");
		int item = sc.nextInt();
		int index = linear(arr,item);
		System.out.println(index);
	}                     // complexity is O(n) in the worst case because we have to compare max of 'n' elements.
}
