package algorithm.searching;

import java.lang.Math;

public class JumpSearch {

    public static int[] arr = { 0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

    /**
     * Jump Search is a searching algorithm for sorted arrays.
     * @param arr
     * @param keySearch
     * @return Integer 
     */
    public static int search(int[] arr, int keySearch) {
        
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(arr.length));

        int prev = 0, next = step;

        while(arr[Math.min(next, arr.length) - 1] < keySearch) {

            prev = next;

            next += step;

            if(prev >= arr.length) {

                return -1;
            }
        }

        // Doing a linear search for x in block beginning with prev.
        while(arr[prev] < keySearch) {

            prev++;

            // If we reached next block or end of array, element is not present.
            if (prev == Math.min(step, arr.length)) return -1;
        }

        // If element is found
        if(arr[prev] == keySearch) {

            return prev;
        }

        return -1;
    }

    public static void main(String[] args){

        int keySearch = 4;

        int indexAfterSearch = search(arr, keySearch);

        int result = 0;

        if(indexAfterSearch != -1) {

            result = arr[indexAfterSearch];
        }

        System.out.println("The result is " + result + " at " + indexAfterSearch);
    }
}