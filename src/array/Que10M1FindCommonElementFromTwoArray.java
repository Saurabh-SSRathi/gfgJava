// Java Program to find common elements
// in two Arrays
// Using iterative method
package array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Que10M1FindCommonElementFromTwoArray {
    private static void findCommonElementFromTwoArray(String[] array1, String[] array2) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    set.add(array1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        String[] array1 = {"JAVA", "SPRING", "SQL", "JDBC", "MQ", "KAFKA", "NO-SQL"};
        String[] array2 = {"JAVA", "SPRING", "NO-SQL", "redis"};
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.print("Common Elements: ");
        findCommonElementFromTwoArray(array1, array2);
    }
}  /*Time Complexity: O(n^2) || Auxiliary Space: O(n)*/
/* Output : Common Elements: JAVA SPRING NO-SQL */