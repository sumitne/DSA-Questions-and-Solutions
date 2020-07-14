import java.util.*;
import java.math.*;
public class FibonacciHuge {
private static long pisanoPeriodLength(long m){
	long prev = 0;
	 long  current = 1;
	long next=1;
	for(int i=0;i<m*m;i++){
	next = (prev+current)%m;
	prev = current;
	current = next;
	if(prev==0&& current==1){
		//System.out.print("pisano length is"+i+1);
		 return i+1;
	 }
	}
return 1;

}
private static long getFibonacciHugeFast(long n, long m) {
      long remainder = n % pisanoPeriodLength(m);

        long F1 = 0, F2 = 1, F = remainder;
        for (int i = 1; i <remainder; i++) {
            F = (F1 + F2)%m ;
            F1 = F2;
            F2 = F;
        }
        return F % m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeFast(n, m));
    }
}

