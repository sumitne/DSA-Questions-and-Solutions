import java.util.*;

public class LCM {
private static long GCD(int a, int b){
	if(b==0) return a;
	return GCD(b,a%b);
}

  private static long lcm_naive(int a, int b) {
    
long temp = ((b/GCD(a,b)));
return a*temp;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
