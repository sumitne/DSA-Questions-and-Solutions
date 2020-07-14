package _2D_Array;
import java.util.Scanner;

public class _2dArray {
	public static void main(String args[]) {
		int arr[][] = input();
		disp(arr);
	}
	private static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dimensions of array");
		int m  = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			System.out.println("Enter the values for "+i+" row");
			for(int j =0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
		
	}
	public static void disp(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
