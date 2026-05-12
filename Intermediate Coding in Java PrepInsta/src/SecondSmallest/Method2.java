//Find Second Smallest Element in an array
package SecondSmallest;

public class Method2 {
    private static int secSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }
        int sec_Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest && arr[i] < sec_Smallest)
                sec_Smallest = arr[i];
        }
        return sec_Smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 14, -5, -8, 4 };
        System.out.println("The 2nd Smallest element is : " + secSmallest(arr));
    }
}
