package algorithm.sorting;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */

public class BubbleSort {
    
    public static int[] arr = {64, 34, 25, 12, 22, 11, 90};
	
	/**
	 * Loop-for the first time, minimum value to be sorted.
	 * 
	 * Time-complexity:  O(n^2)
	 * 
	 * @param arr
	 */
	public void sortA(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int k = i + 1; k < arr.length; k++) {
				
				if( arr[k] < arr[i]) {
					
					int temp = arr[k];
					
					arr[k] = arr[i];
					
					arr[i] = temp;
				}
			}
		}
	}
	
	/**
	 * Time-complexity:  O(n^2)
	 * 
	 * @param arr
	 */
	public void sortB(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int k = 0; k < arr.length - i - 1; k++) {
				
				if( arr[k] > arr[k + 1]) {
					
					int temp = arr[k];
					
					arr[k] = arr[k + 1];
					
					arr[k + 1] = temp;
				}
			}
		}
	}
	
	public static void printResult(int[] arr) {
		
		int i = 0;
		
		while(i < arr.length) {
			
			System.out.println(arr[i]);
			
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.sortA(arr);
		
		printResult(arr);
	}
}
