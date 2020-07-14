package Recursion;
import java.util.ArrayList;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = System.currentTimeMillis();
		System.out.println(Permutation("abcd"));
		long b = System.currentTimeMillis();
		System.out.print(b-a);
	}
	static ArrayList<String> Permutation(String str){
		if(str.length()==1) {
			ArrayList<String> base = new ArrayList<>();
			base.add(str);
			return base;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rosresult = Permutation(ros);
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<rosresult.size();i++) {
			for(int j=0;j<=rosresult.get(i).length();j++) {
				String val = rosresult.get(i).substring(0,j)+cc+rosresult.get(i).substring(j);
				result.add(val);
			}
			
		}
		return result;
	}

}
