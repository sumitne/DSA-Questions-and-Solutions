import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
	int refills = 0;
	int current_refill = 0;
	while(current_refill<stops.length){
		//System.out.println("Current refl"+current_refill);
		int last_refill  = current_refill;
		if(current_refill==stops.length-1) return refills;
		while(current_refill<stops.length-1 && (stops[current_refill+1]-stops[last_refill]<=tank)){
			current_refill+=1;
			
			}
		if(current_refill == last_refill) return -1;
		if(current_refill <stops.length-1) refills++;	
  	 }
        return refills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        for (int i =1; i <n+1; i++) {
            stops[i] = scanner.nextInt();
      }
	stops[n+1]  = dist;
	

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
