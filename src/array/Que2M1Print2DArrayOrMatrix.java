package array;

public class Que2M1Print2DArrayOrMatrix {
    public static void print2DMatrix(int mat[][]) {

        // Loop through all rows
        for (int i=0; i<mat.length; i++) {
            // Loop through all elements of current row
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 9, 10, 11}};
        print2DMatrix(mat);
    }
}

/*
Time Complexity: O(N*M) where N is the number of rows in the matrix and M is the number of columns in the matrix.
Auxiliary Space: O(1)
*/
