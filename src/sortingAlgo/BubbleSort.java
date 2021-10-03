package sortingAlgo;

/*
 * BRIAN LUU
 * 
 * 
 * BUBBLE SORT
 * time complexity: O(n^2), two for loops, each = n. Best would be O(n), assuming all is already sorted.
 * 
 * 
 */
public class BubbleSort {
	int[] list = new int[20];

	public BubbleSort() {
		// fill array with random numbers from 0 to 100
		for (int k = 0; k < list.length; k++) {
			list[k] = (int) (Math.random() * 100);//Math.random returns a double from 0 to 1. (i.e; 0.41)
		}
	}

	//bubble sort algorithm, traverse through array/list, check current element and next element, and swap accordingly until element is at correct position
	public void bubble(int[] list) {
		for (int k = 0; k < list.length; k++) {
			for (int j = 0; j < list.length - 1 - k; j++) {// subtract length - 1 to avoid OOB, and subtract by first
															// iterator because end of list is already sorted
				if (list[j + 1] < list[j]) { // if next element is smaller than current
					swap(list, j, j + 1);
				}
			}
		}
	}

	//private swap method
	private void swap(int[] list, int current, int next) {
		int temp = list[current];
		list[current] = list[next];
		list[next] = temp;
	}

	//print elements of array line by line
	public void print(int[] list) {
		for (int k : list) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		System.out.println("original list:");
		bs.print(bs.list);
		System.out.println("----------");
		bs.bubble(bs.list);
		System.out.println("sorted:");
		bs.print(bs.list);

	}
}
