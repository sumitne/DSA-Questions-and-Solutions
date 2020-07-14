package DSA;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,8,5};
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
				for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
