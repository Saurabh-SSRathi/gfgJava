package string;

import java.util.HashSet;

public class Q5FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "geksforgekks";

        HashSet<Character> characterHashSet = new HashSet<>();

        String s = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(c -> !characterHashSet.add(c))
                .findFirst()
                .map(String::valueOf)
                .orElse("");

        System.out.println(s);

    }
}
