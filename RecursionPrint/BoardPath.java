package RecursionPrint;

public class BoardPath {
	public static void main(String args[]) {
		printBoardPath(0,10,"");
		System.out.println("total number of ways are  "+count);
	}
	static int count =0;
	static void printBoardPath(int curr, int end,String result) {
		if(curr==end) {
			System.out.println(result);
			count++;
			return;
		}
		if(curr>end) {
			return;
		}
		for(int i=1;i<=6;i++) {
			printBoardPath(curr+i,end,result+i);
		}
		
	}
}
