package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que1M4LargestElement {
    public static void main(String[] args) {
        int[] arr = {12 ,2, 54, 12, 67};
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        System.out.println("Largest in given array is " + Collections.max(list));
    }
}
