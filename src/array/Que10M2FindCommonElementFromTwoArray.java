// Java Program to find common elements
// in two Arrays using hashsets
// and retainAll() method
package array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que10M2FindCommonElementFromTwoArray {
    private static void findCommonElementFromTwoArray(int[] array1, int[] array2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Adding elements from array1
        for (int i : array1) {
            set1.add(i);
        }
        // Adding elements from array2
        for (int i : array2) {
            set2.add(i);
        }
        // use retainAll() method to
        // find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4 ,54, 23, 54, 22, 4, 65 };
        int[] array2 = {23, 54, 22, 4, 65, 3, 2, 5};
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.print("Common Elements: ");
        findCommonElementFromTwoArray(array1, array2);
    }
}  /*Time Complexity: O(n) || Auxiliary Space: O(n)*/
/* Output : Common Elements: Common elements- [65, 3, 4, 54, 22, 23] */