package SingleLinkedList;

public class Node<T> {

	private T data;
	private Node next;
	
	public Node () {
		
	}
	
	public Node (T data) {
		this.data = data;
	}
	
	public Node (T data, Node nextNode) {
		this.data = data;
		this.next = nextNode;
	}
	
	public T getData () {
		return data;
	}
	
	public Node getNext () {
		return next;
	}
	
	public void setData (T data) {
		this.data = data;
	}
	
	public void setNext (T data) {
		this.data = data;
	}
	
	/**
	 * Display method
	 * */
	public void display () {
		System.out.print(data + " ");
	}
	
}
