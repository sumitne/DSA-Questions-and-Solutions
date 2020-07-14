package Recursion;
import java.util.ArrayList;
public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(getBoardPath(0,10));
	}
	static ArrayList<String> getBoardPath(int curr,int end){
		if(curr==end) {
			ArrayList<String> pbase = new ArrayList<>();
			pbase.add("\n");
			return pbase;
		}
		if(curr>end) {
			ArrayList<String> nbase =new ArrayList<>();
			return nbase;
			
		}
		ArrayList<String> myresult = new ArrayList<>();
		for(int dice=1;dice<=6;dice++) {
			ArrayList<String> rr = getBoardPath(curr+dice,end);
			for(String rrs : rr) {
				myresult.add(dice+rrs);
			}
		}
		return myresult;
		
	}
}
