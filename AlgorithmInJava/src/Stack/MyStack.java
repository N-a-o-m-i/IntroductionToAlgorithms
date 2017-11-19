package Stack;

public class MyStack {

	// It's actually an array
	private long[] arr;
	private int top;
	
	/**
	 * Default constructor
	 * */
	public MyStack () {
		arr = new long[10];
		// Because by default the stack is empty
		top = -1;
	}
	
	/**
	 * The constructor with parameters
	 * */
	public MyStack (int maxSize) {
		arr = new long[maxSize];
		top = -1;
	}
	
	/**
	 * Add data
	 * */
	public void push (long value) {
		// The top has to add one first
		arr[++top] = value;
	}
	
	/**
	 * Remove data
	 * */
	public long pop () {
		// After return the top, the stack number - 1
		return arr[top--];
	}
	
	/**
	 * Check value
	 * */
	public long peek () {
		return arr[top];
	}
	
	/**
	 * Check if the arr is empty
	 * */
	public boolean isEmpty () {
		return top == -1;
	}
	
	/**
	 * Check if the array is full
	 * */
	public boolean isFull () {
		return top == arr.length - 1;
	}
	
}
