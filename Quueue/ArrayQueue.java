package Quueue;

public class ArrayQueue {
	private int data[];
	private int top;
	private int bottom;
	static int default_capacity = 10;
	ArrayQueue() throws Exception{ //default constructor
		
		this(default_capacity);
	}
	ArrayQueue(int capacity) throws Exception{
		if(capacity<1) throw new Exception("Invalid Capacity");
		this.data = new int[capacity];
		this.top = -1;
		this.bottom = -1;
	}
	public int size() {
		return this.top+1;
	}
	public boolean isEmpty() {
		if(this.size()==0) return false;
		return true;
	}
	public void push(int value) throws Exception{
		if(this.size() == this.data.length) {
			throw new Exception("Queue is Full");
		}
		else {
			this.top++;
		this.data[this.top] = value;
		}
	}
	public void pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("Queue is already Empty");
		}
		else {
			this.top--;
			
		}
	}
}
	
