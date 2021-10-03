package sortingAlgo;

/*
 * BRIAN LUU
 * 
 * 
 * INSERTION SORT
 * worst time complexity: O(n^2), two for loops, each = n. Best would be O(n), assuming all is already sorted.
 * 
 * 
 */
public class InsertionSort {
	int[] list = new int[20];

	public InsertionSort() {
		// fill array with random numbers from 0 to 100
		for (int k = 0; k < list.length; k++) {
			list[k] = (int) (Math.random() * 100);// Math.random returns a double from 0 to 1. (i.e; 0.41)
		}
	}

	// selection sort algorithm, traverse through array/list, find the minimum, then
	// swap with the
	public void insertion(int[] list) {
		for (int k = 1; k < list.length; k++) {// iterate from 1 to n
			int j = k - 1;
			int key = list[k];// need key b/c in place sorting (if we just used list[k], the value would
								// change because we're constantly moving the elements
			// compare current element to predecessor
			while (j >= 0 && list[j] > key) {// iterate from k - 1, and compare each element to its predecessors
				list[j + 1] = list[j]; // move all elements up by 1
				j--; // iterate
			}
			list[j + 1] = key; // currently at index where element is less than key, set next index to the key
		}
	}

	// print elements of array line by line
	public void print(int[] list) {
		for (int k : list) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		System.out.println("original list:");
		is.print(is.list);
		System.out.println("----------");
		is.insertion(is.list);
		System.out.println("sorted:");
		is.print(is.list);

	}
}
