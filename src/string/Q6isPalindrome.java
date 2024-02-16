package string;

public class Q6isPalindrome {

    public static int isPalindrome(String str) {
        for(int i=0; i<str.length()/2;i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
                return 0;
        }
       return 1;
    }
    public static void main(String[] args) {
        String str = "levelw";
        System.out.println(str.length());
        int palindrome = isPalindrome(str);
        if(palindrome==1) {
            System.out.println("Yes");
        } else
            System.out.println("No");

    }
}
