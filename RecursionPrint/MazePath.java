package RecursionPrint;

public class MazePath {
	public static void main(String args[]) {
		PrintMazepath(0,0,2,2,"");
	}
	static void PrintMazepath(int sr,int sc, int er, int ec, String result) {
		if(sr==er && sc==ec) {
			System.out.println(result);
			return;
		}
		if(sr>er || sc>ec) return;
		PrintMazepath(sr,sc+1,er,ec,result+"H");
		PrintMazepath(sr+1,sc,er,ec,result+"V");
		PrintMazepath(sr+1,sc+1,er,ec,result+"D");
	}
	
}