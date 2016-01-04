import java.util.Random;

public class Insertion_Sort 
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		
		populateArray(array);
		System.out.println("Before sorting: ");
		printArray(array);
		System.out.println("\nAfter sorting: ");
		insertionSort(array);
		printArray(array);
	
	}
	
	private static void insertionSort(int[] input)
	{
		int n = input.length;
		for(int i = 1; i < n ; i++)
		{
			int key = input[i];
			int j = i-1;
			while((j >= 0)&&(input[j] > key))
			{
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = key;
		}
	}
	
	private static void printArray(int[] input)
	{
		for(int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + ", ");
		}
	}
	
	private static void populateArray(int[] input)
	{
		Random random = new Random();
		for(int i = 0; i < input.length; i++)
		{
			input[i] = random.nextInt(100);
		}
	}
}
