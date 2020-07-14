package String;

public class StrinbuilderDemo {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello"); // created in heap outside intern pool
		System.out.println(sb); // printing the string builder
		
		System.out.println(sb.length()); //printing length
		
		sb.setCharAt(2,'w'); // setting the char to'w' at index = 2
		System.out.println(sb);
		
		sb.insert(3,'l'); // inserting 'e' at index = 3
		System.out.println(sb);
		 sb.insert(6,'w'); // inserting 'w' at 5th index i.e last index
		 
		 System.out.println(sb);
		 
		 sb.append("orld"); // inserting string "orld" at the end
		System.out.println(sb);
		sb.deleteCharAt(2); // deleting the char at 2nd index
		System.out.println(sb);
		
	}
}
