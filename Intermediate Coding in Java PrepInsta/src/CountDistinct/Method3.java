package CountDistinct;

import java.util.Arrays;

public class Method3 {
    static int countDistinct(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n; i++) {
            while(i < n - 1 && arr[i] == arr[i + 1])
                i++;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        System.out.println("Count of Distinct Elements : " + countDistinct(arr, size));
    }
}
