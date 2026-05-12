//Find Second Smallest Element in an array
package SecondSmallest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Method1 {
    private static int secSmallest(Integer arr[]) {
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        return list.get(1);
    }

    public static void main(String[] args) {
        Integer arr[] = { 2, 8, 14, -5, -8, 4 };
        System.out.println("The 2nd Smallest element is : " + secSmallest(arr));
    }
}
