package _2D_Array;
import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {
		int arr[][] = input();
		disp(arr);

	}
	private static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of array");
		int rows = sc.nextInt();
		int arr[][] = new int[rows][];
		for(int i=0;i<rows;i++) {
			System.out.println("Enter the columns for "+(i+1)+" row");
			int c = sc.nextInt();
			arr[i] = new int[c];
			for(int j =0;j<arr[i].length;j++) {
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
