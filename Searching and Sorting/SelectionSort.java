package DSA;

public class SelectionSort {
	static void selectionsort(int arr[]) {
		
		for(int counter = 0 ; counter<arr.length-1;counter++) {
			int min = counter;
			for(int i=counter+1 ; i<arr.length ; i++) {
				if(arr[i]<arr[min]) {
					min = i;
				}
			}
			int temp = arr[min];
			arr[min]  = arr[counter];
			arr[counter] = temp;
			

		}
	}
	public static void main(String args[]) {
		int arr[] = {88,11,44,99,55,74,46,2,6,1,3,5,7};
		selectionsort(arr);
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println("\n "+arr[i]);
		
		}
	}
}
