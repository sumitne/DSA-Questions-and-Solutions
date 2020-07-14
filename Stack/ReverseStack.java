package Stack;

public class ReverseStack {
	// reverse a stack using a given helper stack
	public static void  main(String args[]) throws Exception{
		StackUsingArray stack = new StackUsingArray(5);
		 for(int i=1;i<=5;i++) {
			 stack.push(i*10);
		 }
		 stack.display();
		 StackUsingArray helper = new StackUsingArray(5);
		 reverseStack(stack,helper,0);
		 stack.display();
	}
	public static void reverseStack(StackUsingArray stack, StackUsingArray helper,int index)throws Exception {
		if(stack.isEmpty()) return;
		int value = stack.pop();
		reverseStack(stack,helper,index+1);
		helper.push(value);
		if(index == 0) {
			while(!helper.isEmpty()){
				stack.push(helper.pop());
			}
		}
	}
}
