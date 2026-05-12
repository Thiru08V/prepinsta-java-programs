//Finding the frequency of elements in an array
package ElementFrequency;

import java.util.Arrays;

public class Method1 {
    public static void main(String[] args) {
        int arr[] = {10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for(int i = 0; i < n; i++) {
            if(visited[i] == false) {
                int count = 1;
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
