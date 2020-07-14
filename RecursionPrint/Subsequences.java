package RecursionPrint;

public class Subsequences {
	public static void main(String [] args) {
		printSub("abc","");
	}
	static void printSub(String str, String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSub(ros, result);
		printSub(ros, result+cc);
	}
}
