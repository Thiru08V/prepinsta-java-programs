package KthSmallest;

import java.util.Arrays;

public class Method2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 2, 5, 6, 3};
        int n = arr.length;
        int k = 4, i;
        Arrays.sort(arr);
        for(i = 0; i < n; i++) {
            while(i < n - 1 && arr[i] == arr[i + 1])
                i++;
            k--;
            if(k == 0)
                break;
        }
        System.out.println(arr[i]);
    }
}
