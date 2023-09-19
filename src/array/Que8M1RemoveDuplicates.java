// Java program to remove duplicates Using extra space
package array;
public class Que8M1RemoveDuplicates {
    public static int removeDuplicate(int[] arr, int n) {
        if(n==0 || n==1 ) { // Return, if array is empty or contains a single element
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++) {
            //If current element is not equal to next element then store that current element
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        } ////Store the last element as whether it is unique or repeated,
        temp[j++] = arr[n-1]; //it hasn't stored previously
        for (int i=0; i<j; i++) { // Modify original array
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 5, 5, 6, 6};
        int n = arr.length;
        n = removeDuplicate(arr, n);//removeDuplicates() returns new size of array
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    } /* Time Complexity: O(N) & Auxiliary Space: O(N) */
} /* Output:1 2 4 5 6 */