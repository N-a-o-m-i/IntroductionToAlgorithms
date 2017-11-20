package SingleLinkedList;

public class SingleLinkedList<T> {

	// head node
	private Node headNode;
	private Node currentNode;
	private int size;
	
	public SingleLinkedList () {
		headNode = new Node();
		currentNode = null;
		size = 0;
	}
	
	public int size () {
		return size;
	}
	
	public boolean isEmpty () {
		return size == 0;
	}
	
	public boolean isIndexOk (int n) {
		if (n < -1 || n >= size) return false;
		return true;
	}
	
	// locate the pointer of current node to nth
	public void toIndexOf (int n) {
		if (isEmpty() || !isIndexOk(n)) {
			throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + size);
		}
		currentNode = headNode;
		if (n == -1) return; // if n = 0
		
		while (n != -1) {
			currentNode = currentNode.getNext();
			n--;
		} 
	}
	
	/**
	 * Insert Node to the end of the list
	 * */
	public void insert (T data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			headNode.setNext(newNode);
		} else {
			toIndexOf(size - 1);
			currentNode.setNext(newNode);
		}
		size++;
	}
	
	/**
	 * Insert Node to nth
	 * */
	public void insert (T data, int n) {
		// locate the current pointer to (n-1)th
		toIndexOf(n-1);
		
		// if it's empty, insert to the headNode
		if (isEmpty()) {
			insert(data);
			return;
		}
		
		// point newNode.next to nth node
		// point (n-1)th node to new node
		currentNode.setNext(new Node(data, currentNode.getNext()));
		size++;
	}
	
	
	/**
	 * delete Node at nth
	 * */
	public T delete (int n) {
		toIndexOf(n - 1);
		T data = (T) currentNode.getNext().getData();
		currentNode.setNext(currentNode.getNext().getNext());
		size--;
		return data;
	}
	
	/**
	 * delete some node
	 * */
	public T deleteElemBy (T data) {
		int n = getElementAt(data);
		return delete(n);
	}
	
	/**
	 * Check nth node
	 * */
	public <T> T get (int n) {
		// locate the currentNode to nth node
		toIndexOf(n);
		return (T) currentNode.getData();
	}
	
	/**
	 * Check the index of some node
	 * */
	public int getElementAt(T data) {
		if (data == null) {
			throw new NullPointerException("If you llike null, I'll give you null");
		}
		currentNode = headNode.getNext();
		int i = 0;
		while (currentNode != null) {
			if (currentNode.getData().equals(data)) {
				return i;
			}
			i++;
			currentNode = currentNode.getNext();
		}
		return -1;
	}
	
	/**
	 * Change the value of some node
	 * */
	public boolean setElemAt (T data, int n) {
		toIndexOf(n);
		currentNode.setData(data);
		return true;
	}
	
	/**
	 * Check if a node is existed or not
	 * */
	public boolean contains (T data) {
		return getElementAt(data) == -1 ? false : true; 
	}
	
	/**
	 * transfer to array
	 * */
	public Object[] toArray () {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Size: " + size);
		}
		Object[] arr = new Object[size];
		toIndexOf(0);
		int i = 0;
		while (currentNode != null) {
			arr[i++] = currentNode.getData();
			currentNode = currentNode.getNext();
		}
		return arr;
	}
	
}
