package BubbleSort;

public class BubbleSort {

	public static void sort(long[] arr) {
		long tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			// check from the bottom of the array
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					// swap
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
	
}
