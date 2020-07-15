package Greedy_Algorithms;
import java.util.*;
public class Activity_Selection {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the no of activites");
	
	int start[] = {1, 3, 0, 5, 8, 5};
	int finish[] = {2, 4, 6, 7, 9, 9};
	int n = start.length;
	//System.out.println("Enter the start time for the activites ");
	//for(int i=0;i<n;i++) {
		//start[i] = sc.nextInt();
	//}
	//System.out.println("Enter the finish time for tha activites");
	//for(int i=0;i<n;i++) {
	//	finish[i] = sc.nextInt();
	//}
	ActivitySelection(start,finish,n);
}
	private static void ActivitySelection(int[] start, int[] finish, int n) {
		//Arrays.sort(finish);
		System.out.println("following activites are selected ");
		System.out.println("start "+start[0]+" finish "+finish[0]);
		int prevfinish = finish[0];
		for(int i=1;i<n;i++) {
			if(start[i]>=prevfinish) {
				System.out.println("start "+ start[i]+" finish "+finish[i]);
				prevfinish = finish[i];
			}
		}
		
	}
}
