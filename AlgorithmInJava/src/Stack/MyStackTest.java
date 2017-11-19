package Stack;

public class MyStackTest {

	public static void main (String[] args) {
		
		MyStack stack = new MyStack(4);
		// 23, 15, 40, 2
		stack.push(23);
		stack.push(15);
		stack.push(40);
		stack.push(2);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
	}
	
}
