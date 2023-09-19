package array;

public class Que7M1BoundaryElements {

    private void BoundaryElements(int[][] mat) {
        System.out.println("Input Matrix is: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                System.out.print(" "+ mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Resultant matrix is :");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == 0 || i == mat.length - 1
                        || j == mat[i].length - 1) {
                    System.out.print(" "+mat[i][j]);
                }
                else {  System.out.print("  "); }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        Que7M1BoundaryElements que7M1BElem = new Que7M1BoundaryElements();
        que7M1BElem.BoundaryElements(mat);
    }
}