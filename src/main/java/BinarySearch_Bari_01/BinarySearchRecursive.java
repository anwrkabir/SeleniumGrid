package BinarySearch;

public class BinarySearchRecursive {

    // Recursive binary search method
    public static int binarySearch(int[] arr, int low, int high, int key) {


        if( low== high)
        {
            if ( arr[low]== key){
                return  low;
            }
            else  return -1;
        }
        // Find the middle index
       // int mid = low + (high - low) / 2;
        int mid = (low + high ) / 2;

        // Check if the key is at the middle
        if (arr[mid] == key) {
            return mid; // key found
        }

        // Recur on the low half if the key is smaller
        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }

        // Recur on the high half if the key is larger
       else  return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
        int key = 42;

        // Perform binary search
        int result = binarySearch(arr, 0, arr.length , key);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    
}
