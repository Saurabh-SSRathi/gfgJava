// Java program to print the elements of
// a 2 D array or matrix using for-each
package array;

import java.util.Arrays;

public class Que2M4Print2DArrayOrMatrix {
    public static void print2DMatrix(int[][] mat) {

        System.out.println(Arrays.deepToString(mat));
    }

    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        print2DMatrix(mat);
    }
}

/* Output : [1, 2, 3, 4]
            [5, 6, 7, 8]
            [9, 10, 11, 12] */

/*
Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
Auxiliary Space: O(1)
*/
