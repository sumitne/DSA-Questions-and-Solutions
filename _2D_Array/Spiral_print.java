package _2D_Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Spiral_print {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the rows");
		int m = sc.nextInt();
		System.out.print("Enter the columns ");
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		System.out.print("Enter the elements");
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(" \n *************************** \n");
		System.out.print(SprialPrint(arr));
	}
	 public static ArrayList<Integer> SprialPrint (int[][] matrix) {
	        ArrayList<Integer> arr = new ArrayList<>();
	        int top = 0;
	        int bottom = matrix.length-1;
	        int left = 0;
	        int right = matrix[top].length-1;
	        int count = (bottom+1) * (right+1);
	        int direction = 1;
	        while(left<=right && top<=bottom){
	            if(count>0){
	                if(direction==1){
	                    for(int i = left;i<=right;i++){
	                        arr.add(matrix[top][i]);
	                        count--;
	                        
	                    }
	                    top++;
	                    direction=2;
	                }
	            }
	            if(count>0){
	                if(direction==2){
	                    for(int i=top;i<=bottom;i++){
	                        arr.add(matrix[i][right]);
	                        count--;
	                    }
	                    right--;
	                    direction = 3;
	                }
	            }
	            if(count>0){
	                if(direction ==3 ){
	                    for(int i = right;i>=left;i--){
	                        arr.add(matrix[bottom][i]);
	                        count--;
	                    }
	                    bottom--;
	                    direction =4;
	                }
	            }
	            if(count>0)
	                if(direction==4){
	                    for(int i = bottom;i>=top;i--){
	                        arr.add(matrix[i][left]);
	                            count--;
	                    }
	                    left++;
	                    direction=1;
	                }
	        }
	        return arr;
	    }

}
