package SingleLinkedList;

public class SingleLinkedListTest {

	public static void main (String[] args) throws Exception {
		
		SingleLinkedList<Integer> test = new SingleLinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			test.insertFirst(i);
		}
		System.out.println("----------testing----------");
		test.deleteFirst();
		test.display();
		test.deleteFirst();
		test.display();
		System.out.println("Finding 5 : " + test.find(5));
		System.out.println("Finding 50 : " + test.find(50));
	}
	
}
