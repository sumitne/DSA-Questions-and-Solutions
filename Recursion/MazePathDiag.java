package Recursion;
import java.util.ArrayList;
public class MazePathDiag {
	public static void main(String args[]) {
		System.out.print(GetPath(0,0,2,2));
		
	}
	
	static ArrayList<String> GetPath(int sr,int sc,int er,int ec){
		if(sr==er && sc==ec) {
			ArrayList<String> pbase = new ArrayList<>();
			pbase.add("");
			return pbase;
		}
		if(sr>er || sc>ec) {
			ArrayList<String> nbase = new ArrayList<>();;
			return nbase;
		}
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> rrh = GetPath(sr,sc+1,er,ec);
		
		for(int i=0;i<rrh.size();i++) {
			myresult.add("H"+rrh.get(i));
		}
		ArrayList<String> rrv = GetPath(sr+1,sc,er,ec);
		for(int i=0;i<rrv.size();i++) {
			myresult.add("V"+rrv.get(i));
		}
		ArrayList<String> rrd = GetPath(sr+1,sc+1,er,ec);
		for(int i=0;i<rrd.size();i++) {
			myresult.add("D"+rrd.get(i));
		}
		return myresult;
		
	}
}
