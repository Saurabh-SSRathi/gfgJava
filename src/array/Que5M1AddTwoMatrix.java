// Java program for addition of two matrices
package array;

public class Que5M1AddTwoMatrix {
    // Method to print Matrix
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }

    // Method to add the two matrices and store in matrix C
    static int[][] add(int A[][], int B[][], int size) {

        int C[][] = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }


    public static void main(String[] args) {
        int size = 4;

        int A[][] = { { 10, 10, 10, 10 },
                      { 20, 20, 20, 20 },
                      { 30, 30, 30, 30 },
                      { 40, 40, 40, 40 } };
        // Print the matrices A
        System.out.println("Matrix A:");
        printMatrix(A, size, size);

        int B[][] = { { 10, 10, 10, 10 },
                      { 20, 20, 20, 20 },
                      { 30, 30, 30, 30 },
                      { 40, 40, 40, 40 } };

        // Print the matrices B
        System.out.println("Matrix B:");
        printMatrix(B, size, size);

        // Add the two matrices
        int C[][] = add(A, B, size);

        // Print the result
        System.out.println("Resultant Matrix:");
        printMatrix(C, size, size);

    }
}
