//Find Smallest Element in an Array
package SmallestElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Method2 {
    private static int getSmallest(Integer arr[]) {
        List<Integer> list = Arrays.asList(arr);
        /*
        Collections.sort(list);
        int min = list.get(0);
        */
        //Or
        int min = Collections.min(list);
        return min;
    }
    public static void main(String[] args) {
        Integer arr[] = {7, 11, 18, -3, -7, 4};
        System.out.println("The Smallest element is : " + getSmallest(arr));
    }
}
