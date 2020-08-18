package DSA;
public class MergeSort {
	private static void Print(int[] array) {
		for(int n : array) {
			System.out.println(n+" ");
		}
	}
	private static int[] Merge(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		int i=0,j=0,id=0;
		while(i<left.length||j<right.length) {
			if(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				result[id] = left[i];
				i++;
				id++;
			}
			else {
				result[id] = right[j];
				j++;
				id++;
			}
		}
			else if(i<left.length) {
				result[id] = left[i];
				i++;
				id++;
			}
			else if(j<right.length){
				result[id] = right[j];
				j++;
				id++;
			}
		}
		return result;
	}
	private static int[] MergeSort(int[] array) {
		if(array.length<=1) {
			return array;
		}
		int midpoint = array.length/2;
		int[] left = new int[midpoint];
		int[] right  = new int[array.length-midpoint];
		
		for(int i=0;i<midpoint;i++) {
			left[i] = array[i];
			
		}
		for(int j=0;j<right.length;j++) {
			right[j] = array[j+midpoint];
			
		}
		int[] result = new int[array.length];
		left = MergeSort(left);
		right= MergeSort(right);
		
		result = Merge(left,right);
		return result;
	}
	public static void main(String args[]) {
		int arr[] = {43,2,3,65,11,0,-1,99,3,1,1,2};
		arr = MergeSort(arr);
		Print(arr);
	}
	
	
}
