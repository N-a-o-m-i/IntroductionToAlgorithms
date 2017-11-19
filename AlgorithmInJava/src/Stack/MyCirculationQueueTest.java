package Stack;

public class MyCirculationQueueTest {

public static void main (String[] args) {
		
		MyCirculationQueue queue = new MyCirculationQueue(4);
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
		
		queue.insert(25); // Works
		queue.insert(20);
		queue.insert(15);
		queue.insert(10);
		
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
		
	}
	 
}
