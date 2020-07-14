package RecursionPrint;
import java.util.*;
	class Test{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			// transpose
			int temp;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					//swap
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
			
	}
}