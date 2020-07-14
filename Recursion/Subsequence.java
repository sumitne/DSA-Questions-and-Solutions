package Recursion;
import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getSS("ab"));
	}

	static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		char cc = str.charAt(0);
		String ros =  str.substring(1);
	   ArrayList<String> result = new ArrayList<>();
	   ArrayList<String> rosresult = getSS(ros);
	   for(int i=0;i<rosresult.size();i++) {
		   result.add(rosresult.get(i));
		   result.add(cc+rosresult.get(i));
		   String ascii="";
		   for(int j=0;j<rosresult.get(i).length();j++) {
			   char ch = rosresult.get(i).charAt(j);
			   ascii += (int)ch;
		   }
		   if(ascii.equals("")) {
		   }
		   
		   else {
			   result.add(ascii);
		   }
		   }
	   return result;
	}

}
