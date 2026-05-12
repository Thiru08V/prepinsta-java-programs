//Kth Smallest Element in an array
package KthSmallest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Method1 {
    private static int getSmallest(Integer arr[], int k) {
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        return list.get(k - 1);
    }
    public static void main(String[] args) {
        Integer arr[] = {2, 8, 14, -5, -8, 4};
        int k = 4;
        System.out.println(getSmallest(arr, k));
    }
}
