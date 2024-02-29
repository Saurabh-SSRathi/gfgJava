package string;

class Solution {

    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        // Your code here
        char string[] = line.toCharArray();
        int[] freq = new int[line.length()];
        int i, j;
        char maxChar = string[0];
        for (i = 0; i < string.length; i++) {

            freq[i] = 1;

            for (j = 0; j < string.length; j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                }
            }
        }

        int max = freq[0];

        for (i = 0; i < freq.length; i++) {
            if (max < freq[1]) {
                max = freq[i];
                maxChar = string[i];
            }
        }

        return maxChar;
    }
}