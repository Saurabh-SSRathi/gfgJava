package string;

public class Q7reverseString {
    public static void main(String[] args) {

        String str = "samir";
        String string = reverseString(str);
        System.out.println(string);


    }

/*    public static String reverseString (String str) {
        StringBuilder stringBuffer  = new StringBuilder(str);
        return stringBuffer.reverse().toString();
    }*/

    public static String reverseString(String str) {

        char[] charArray= str.toCharArray();

        for (int i=0, j= str.length()-1; i<j; i++,j-- ) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
        //return String.valueOf(charArray);
    }
}
