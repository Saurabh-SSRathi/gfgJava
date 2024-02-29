package string;

public class Q3reverseWords {

    public static void main(String[] args) {

        String str = "I.am.saurabh";
        String[] strArray = str.split("\\.");
        for (String s : strArray) {
            System.out.println(s);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = strArray.length-1; i>=0; i--) {
            stringBuilder.append(strArray[i]).append(".");
        }

        String s = stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
        System.out.println(s);
    }
}
