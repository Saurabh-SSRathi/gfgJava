// Java Program to find transpose of a matrix
package array;
public class Que6M1MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = { {1, 1, 1},
                           {2, 2, 2},
                           {3, 3, 3}};
        int [][] transpose = transposeMatrix(matrix);
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Transpose Matrix:");
        printMatrix(transpose);
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int [cols][rows];
        for (int i =0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            } }
        return transpose;
    }
    private static void printMatrix(int[][] matrix) {
        for (int i =0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " "); }
            System.out.println(); //Move to the next row
        } } }