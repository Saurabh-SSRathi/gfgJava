// Java Program to find maximum in arr[]
package array;
public class Que1M1LargestElement {

    static int[] arr = {12 ,2, 54, 12, 67};

    static int largest() {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }

    /* Output: Largest in given array is 67 */

    /*Note:
      Time Complexity: O(n), where n represents the size of the given array.
      Auxiliary Space: O(1), no extra space is required, so it is a constant.
     */
}
