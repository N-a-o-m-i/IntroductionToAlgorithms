package Stack;

public class MyQueueTest {

	public static void main (String[] args) {
		
		MyQueue queue = new MyQueue(4);
		queue.insert(25);
		queue.insert(20);
		queue.insert(15);
		queue.insert(10);
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		queue.insert(50); // Not working
		
	}
	
}
