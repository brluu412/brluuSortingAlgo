package sortingAlgo;

/*
 * BRIAN LUU
 * 
 * 
 * SELECTION SORT
 * worst time complexity: O(n^2), two for loops, each = n. Best would be O(n^2), since traversal is required twice.
 * 
 * 
 */
public class SelectionSort {
	private int[] list = new int[20];

	public SelectionSort() {
		// fill array with random numbers from 0 to 100
		for (int k = 0; k < list.length; k++) {
			list[k] = (int) (Math.random() * 100);// Math.random returns a double from 0 to 1. (i.e; 0.41)
		}
	}

	// selection sort algorithm, traverse through array/list, find the minimum, then
	// swap with the
	public void selection(int[] list) {
		for (int k = 0; k < list.length - 1; k++) {
			int minimum = k;// set minimum index as current index
			for (int j = k + 1; j < list.length; j++) {// iterate through list to find minimum
				if (list[j] < list[minimum]) {// check if current is less than minimum, set minimum to current
					minimum = j;
				}
			}
			swap(list, k, minimum);// traversed through list, swap minimum index with current index k
		}
	}

	// private swap method
	private void swap(int[] list, int current, int next) {
		int temp = list[current];
		list[current] = list[next];
		list[next] = temp;
	}

	// print elements of array line by line
	public void print(int[] list) {
		for (int k : list) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		System.out.println("original list:");
		ss.print(ss.list);
		System.out.println("----------");
		ss.selection(ss.list);
		System.out.println("sorted:");
		ss.print(ss.list);

	}
}
