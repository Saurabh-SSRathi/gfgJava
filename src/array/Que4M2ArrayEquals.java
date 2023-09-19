// Java Program to find the if the arrays are equal
package array;

import java.util.Arrays;

public class Que4M2ArrayEquals {
    public static void main(String[] args) {

        // Initializing the 1st array
        int a[] = {10,20,30,40};
        // Initializing the 2nd array
        int b[] = {10,20,30,40};

        //store the result
        boolean result = true;

        // Check if length of the two arrays are equal or
        // not
        if (a.length == b.length) {

            // Loop to check elements of arrays one by one
            for (int i = 0; i < a.length; i++) {

                // To check if any element is different
                if (a[i] != b[i]) {

                    // If any element is different then it
                    // will assign false into boolean
                    // variable
                    result = false;
                }
            }

            // After completion to check whether
            // result is true of false
            if (result == true) {
                // Print the result
                System.out.println("Arrays are equal!!");
            } else {
                // Print the result
                System.out.println("Arrays are not equal");
            }
        }
    }
}

/*  Time Complexity : O(n)
    Auxiliary Space : O(1)  */

/* Output: Two arrays are equal!! */