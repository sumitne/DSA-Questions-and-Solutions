package DSA;
import java.util.Scanner;
public class ArrayMax {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the elements of the array");
	for(int i = 0; i<size; i++) {
		arr[i] =  sc.nextInt();
	}
	int in = 0 ;
	int max = Integer.MIN_VALUE;
	for( int i = 0; i<size; i++) {
		if(arr[i]>max) {
			max = arr[i];
			in = i;
			
		}
	}
	System.out.println("Max element of array is "+max);
	}
}
