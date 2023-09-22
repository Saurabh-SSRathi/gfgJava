package array;

import java.util.Arrays;

public class Que9M1RemoveAllOccurrencesOfAnElement {
    // function to remove all occurrences of an element from an array
    private static int[] removeElements(int[] arr, int key) {
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != key) {
                arr[index++] = arr[i];
            }
        }
        // Create a copy of arr[]
        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5,6,2,2,};
        int key = 3;
        arr = removeElements(arr,key);
        System.out.println(Arrays.toString(arr));
    }
}
/*Time Complexity: O(n)
Space Complexity: O(n)*/
/* Output : [1, 2, 2, 4, 5, 6, 2, 2] */
