package RecursionPrint;

public class Permutation {
	public static void main(String args[]) {
		permutation("abc", "");
	}
	static void permutation(String que, String ans) {
		if(que.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<que.length();i++) {
			char ch = que.charAt(i);
			String roq = que.substring(0,i)+que.substring(i+1);
			permutation(roq,ans+ch);
		}
	}
}
