package String;
import java.util.*;
public class Substrings {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		PrintSubString(s);
	}
public static void PrintSubString(String s) {
	for(int i=0;i<s.length();i++) {
		for(int j=1+i;j<=s.length();j++) {
			System.out.println(s.substring(i,j));
		}
	}
}
}
