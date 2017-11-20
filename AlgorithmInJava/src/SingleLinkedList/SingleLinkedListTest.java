package SingleLinkedList;

public class SingleLinkedListTest {

	public static void main (String[] args) {
		
		SingleLinkedList<Integer> test = new SingleLinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			test.insert(i);
		}
		System.out.println("----------testing----------");
		System.out.println("Read index: ");
		System.out.println(test.get(0) + ",");
		System.out.println(test.get(4) + ",");
//		System.out.println(test.get(test.size() - 1));
		
	}
	
}
