package SingleLinkedList;

public class SingleLinkedList<T> {

	private class Node {
		private Object obj;
		private Node next = null;
		
		Node (Object obj) {
			this.obj = obj;
		}
	}
	
	private Node first = null;
	
	/**
	 * O(1)
	 * */
	public void insertFirst (Object obj) {
		Node node = new Node(obj);
		node.next = first;
		first = node;
	}
	
	/**
	 * O(1)
	 * */
	public Object deleteFirst () throws Exception {
		if (first == null) {
			throw new Exception("Empty");
		}
		Node tmp = first;
		first = first.next;
		return tmp.obj;
	}
	
	/**
	 * O(N)
	 * */
	public Object find (Object obj) throws Exception {
		if (first == null) {
			throw new Exception("LinkedList is Empty!");
		}
		Node cur = first;
		while (cur != null) {
			if (cur.obj.equals(obj)) {
				return cur.obj;
			}
			cur = cur.next;
		}
		return null;
	}
	
	/**
	 * O(N)
	 * */
	public void remove (Object obj) throws Exception {
		if (first == null) {
			throw new Exception("LinkedList is empty");
		}
		if (first.obj.equals(obj)) {
			first = first.next;
		} else {
			Node pre = first;
			Node cur = first.next;
			while (cur != null) {
				if (cur.obj.equals(obj)) {
					pre.next = cur.next;
				}
				pre = cur;
				cur = cur.next;
			}
		}
	}
	
	public void display () {
		if (first == null) {
			System.out.println("Empty LinkedList");
		}
		Node cur = first;
		while (cur != null) {
			System.out.print(cur.obj.toString() + " -> ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	
	
}
