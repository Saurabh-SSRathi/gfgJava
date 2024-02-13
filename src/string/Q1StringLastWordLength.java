package string;

public class Q1StringLastWordLength {
    public static void main(String[] args) {

        String str = "  fly me  to the  moon";

        String[] st = str.split(" ");
        for (String s: st) {
            System.out.print(s+" ");
        }
        int strLength = st[st.length-1].length();
        System.out.println(strLength);

        String trim = str.trim();



    }
}
