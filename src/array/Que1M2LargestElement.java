//Java Program to find largest element in an array using java 8 Stream
package array;

import java.util.Arrays;

public class Que1M2LargestElement {

    static int[] arr = {12 ,2, 54, 12, 67};

    static int max = Arrays.stream(arr).max().getAsInt();

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + max);
    }

    /* Output: Largest in given array is 67 */

    /*Note:
      Time Complexity: O(n), where n represents the size of the given array.
      Auxiliary Space: O(1), no extra space is required, so it is a constant.
     */
}
