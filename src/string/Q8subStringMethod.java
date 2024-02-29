package string;

import java.util.ArrayList;
import java.util.List;

public class Q8subStringMethod {
    public static void main(String[] args) {

        String originalString = "geeks for geeks";
        String searchString = "eeks";

        int count = countSubstringOccurrences(originalString, searchString);

        System.out.println("Number of occurrences of \"" + searchString + "\": " + count);

    }

    private static int countSubstringOccurrences(String s, String x) {

        int sLength = s.length();
        int xLength = x.length();

        for (int i=0; i< sLength-xLength; i++) {

            boolean found = true;
            int j;
            for (j=0; j<xLength;j++){
                if(s.charAt(i+j) != x.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found) {
                return i;
            }
        }
        return -1;
    }
}































/*
*         int sLength = s.length();
        int xLength = x.length();

        for (int i = 0; i <= sLength - xLength; i++) {
            int j;
            boolean found = true;
            for (j = 0; j < xLength; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;*/
