import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static BigInteger getMaxPairwiseProduct(int[] numbers) {
       // int max_product = 0;
	BigInteger f = new BigInteger("1"); 
        int n = numbers.length;
	int temp1 = -1;
	BigInteger firstmax;
	int firstmaxindex  = 0;
	int temp = -1;
	for(int i=0;i<n;i++){
		if(numbers[i]>temp1){
			temp1=numbers[i];
			firstmaxindex = i;
		}
	}	
	firstmax= BigInteger.valueOf(temp1);
	BigInteger secondmax;
	for(int i=0;i<n;i++){
		if(i!=firstmaxindex && numbers[i]>temp){
			temp= numbers[i];
		}
	}
	secondmax= BigInteger.valueOf(temp);
	f = firstmax.multiply(secondmax);	
        return f;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
