// Java Program to find the if the arrays are equal
package array;

import java.util.Arrays;

public class Que4M1ArrayEquals {
    public static void main(String[] args) {

        // Initializing the first array
        int a[] = {10, 20, 30};

        // Initializing the second array
        int b[] = {10, 20, 30};

        // store the result
        // Arrays.equals(a, b) function is used to check
        // whether two arrays are equal or not
        boolean result = Arrays.equals(a, b);

        // condition to check whether the
        // result is true or false
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}

/* Output: Two arrays are equal */