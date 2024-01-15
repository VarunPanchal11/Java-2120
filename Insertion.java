import java.util.Arrays;

public class Insertion {

	public static int insertionSort(int array[]) {
	  int size = array.length;
	  int count = 0;
  
	  for (int step = 1; step < size; step++) {
		int key = array[step];
		int j = step - 1;
		count++;
  
		while (j >= 0 && key < array[j]) {
		  array[j + 1] = array[j];
		  --j;
		  count++;
		}
  
		// Place key at after the element just smaller than it.
		array[j + 1] = key;
	  }
	  return count;
	}
  
	// Driver code
	public static void main(String args[]) {
	  int[] data = { 81, 94, 11, 96, 12, 35, 17, 95};

	  System.out.println(insertionSort(data));
	}
	  
  }
