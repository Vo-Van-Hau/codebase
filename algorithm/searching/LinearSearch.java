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

    public static void main(String[] args) {

        LinearSearch linearSearch = new LinearSearch();

        int keySearch = 22;

        int indexAfterSearch = linearSearch.search(arr, keySearch);

        int result = 0;

        if(indexAfterSearch != -1) {

            result = arr[indexAfterSearch];
        }


        System.out.println("The result is " + result + " at " + indexAfterSearch);
    }
}
