// Java program to demonstrate copying by
// one by one assigning elements between arrays
package array;

public class Que3M1ArrayCopy {
    public static void main(String[] args) {
        // Input array a[]
        int a[] = {1,6,3,4};

        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Copying elements of a[] to b[]
        for (int i=0; i < a.length; i++)
            b[i] = a[i];

        // Changing b[] to verify that
        // b[] is different from a[]
        b[0]++;

        System.out.println("Contents of a[] ");
        for ( int i = 0; i< a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for ( int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
