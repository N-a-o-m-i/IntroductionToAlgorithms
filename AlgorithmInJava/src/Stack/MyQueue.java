package Stack;

public class MyQueue {

	// It's actually implemented by array
	private long[] arr;
	// valid data size
	private int elements;
	// front
	private int front;
	// end
	private int end;
	
	/**
	 * Default constructor
	 * */
	public MyQueue () {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	/**
	 * Constructor with parameters
	 * */
	public MyQueue (int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	/**
	 * Add value to the end of the array
	 * */
	public void insert (long value) {
		// first (end + 1), then add value to the end
		arr[++end] = value;
		elements++;
	}
	
	/**
	 * Remove the value from the start of the array
	 * */
	public long remove () {
		elements--;
		// first return the first value of the array, then (front + 1) means front is the value after the front
		return arr[front++];
	}
	
	/**
	 * Check the value from the start of the array
	 * */
	public long peek () {
		return arr[front];
	}
	
	/**
	 * Check is the array is empty
	 * */
	public boolean isEmpty () {
		return elements == 0;
	}
	
	/**
	 * Check if the array is full
	 * */
	public boolean isFull () {
		return elements == arr.length;
	}
	
	
	
}
