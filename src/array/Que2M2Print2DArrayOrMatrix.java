// Java program to print the elements of
// a 2 D array or matrix using for-each
package array;

public class Que2M2Print2DArrayOrMatrix {
    public static void print2DMatrix(int[][] mat) {

        // Loop through all rows
        for (int[] row : mat) {
            // Loop through all elements of current row
            for (int x : row) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 9, 10, 11}};
        print2DMatrix(mat);
    }
}

/* Output : 1 2 3 4 5 6 7 8 8 9 10 11 */

/*
Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
Auxiliary Space: O(1)
*/
