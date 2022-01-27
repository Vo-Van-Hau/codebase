package algorithm.searching;

public class LinearSearch {
    
    public static int[] arr = {64, 34, 25, 12, 22, 11, 90};

    /**
     * The time complexity of the algorithm is O(n). 
     * @param arr
     * @param keySearch
     * @return Integer 
     */
    public static int search(int[] arr, int keySearch) {

        int i = 0;

        while(i < arr.length) {

            if(arr[i] == keySearch) {

                return i;
            }

            i++;
        }

        return -1;
    }

    /**
     * Improve Linear Search Worst-Case Complexity: if element Found at last O(n) to O(1)
     * @param arr
     * @param keySearch
     * @return
     */
    public static int searchOptimized(int[] arr, int keySearch) {

        int l = 0, r = arr.length - 1, position = -1; 

        while( l <= r ) {

            if(arr[l] == keySearch) {

                position = l;

                break;
            }

            if (arr[r] == keySearch) {
                
                position = r;

                break;
            }
            
            l++;
            r--;
        }

        if(position != -1) {

            return position;
        }

        return -1;
    }

    public static void main(String[] args) {

        int keySearch = 25;

        int indexAfterSearch = search(arr, keySearch);

        int result = 0;

        if(indexAfterSearch != -1) {

            result = arr[indexAfterSearch];
        }

        System.out.println("The result is " + result + " at " + indexAfterSearch);
    }
}
