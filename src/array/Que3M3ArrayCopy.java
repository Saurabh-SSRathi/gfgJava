// Java program to demonstrate array
// copy using System.arraycopy()
package array;

public class Que3M3ArrayCopy {
    public static void main(String[] args) {
        // Input array a[]
        int a[] = {1,6,3,4};

        // Creating an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Copying elements of a[] to b[]
        System.arraycopy(a,0,b,0,4);

        // Changing b[] to verify that
        // b[] is different from a[]
        b[0]++;

        System.out.println("Contents of a[] ");
        for ( int i = 0; i< a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nContents of b[] ");
        for ( int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}

/* Output :
    Contents of a[]
    1 6 3 4
    Contents of b[]
    2 6 3 4
*/
