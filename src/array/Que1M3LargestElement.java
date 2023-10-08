// Java program to find maximum in
// arr[] of size n
package array;

import java.util.Arrays;

public class Que1M3LargestElement {
    static int largest(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {12 ,2, 54, 12, 67};
        int n = arr.length;
        System.out.println("Largest in given array is " + largest(arr,n));
    }

    /*Note:
      Time Complexity: O(n logn), where n represents the size of the given array.
      Auxiliary Space: O(1), no extra space is required, so it is a constant.
     */
}
