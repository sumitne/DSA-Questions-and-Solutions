package Stack;

public class StackUsingArray {
	private int data[];
	private int top;
	public static final int default_capacity = 10;
	StackUsingArray() throws Exception{
		// default constructor
		this(default_capacity); // calling the main constructor
	}
	StackUsingArray(int capacity) throws Exception {
		if(capacity<1) {
			throw new Exception("Invalid Capacity");
		}
		this.data = new int[capacity];
		this.top = -1;
		
	}
	public int size() {
		return this.top+1;
	}
	public boolean isEmpty() {
		if(this.size()==0) return true;
		return false;
	}
	public void push(int value)throws Exception {
	if(this.size()==this.data.length) {
		throw new Exception("Stack Overflow");
	}
	else {
		this.top++;
		data[this.top] = value;
	}
	}
	public int pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack Underflow");
		}
		else {
			int temp = this.data[this.top];
			this.data[this.top] = 0;
			this.top--;
			return temp;
			
		}
	}
	public int top() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
			else {
				return this.data[this.top];
			}
	}
	public void display() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		else {
			for(int i=this.top;i>=0;i--) {
				System.out.print(this.data[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) throws Exception {
		StackUsingArray s1 = new StackUsingArray(6);
		s1.push(1);
		s1.push(5);
		s1.push(3);
		System.out.println(s1.size());
		s1.push(2);
		s1.pop();
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		s1.display();
	}
}
