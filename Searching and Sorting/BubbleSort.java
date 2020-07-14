package DSA;
import java.util.Scanner;
public class BubbleSort {
static void bubblesort(int arr[]) {
	for(int counter = 0 ; counter<arr.length-1 ;counter++) {
		for(int j = 0 ; j<arr.length-1-counter;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	}


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the elements of the array");
	for(int i = 0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	bubblesort(arr);
	for(int i = 0 ; i<arr.length;i++) {
		System.out.println("\n "+arr[i]);
	
	}
}
}
