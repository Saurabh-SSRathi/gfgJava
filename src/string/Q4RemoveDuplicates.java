package string;

import java.util.LinkedHashSet;

public class Q4RemoveDuplicates {
    public static void main(String[] args) {

        String inputString= "saurabh";

        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet();

        for (char ch : inputString.toCharArray()) {
            linkedHashSet.add(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : linkedHashSet) {
            stringBuilder.append(ch);
        }

        System.out.println(stringBuilder.toString());

    }
}
