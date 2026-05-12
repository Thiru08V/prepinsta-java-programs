//Find Smallest Element in an Array
package SmallestElement;

public class Method1 {
    private static int getSmallest(int arr[]) {
        int min = arr[0];
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 11, 18, -3, -7, 4 };
        System.out.println("The Smallest element is : " + getSmallest(arr));
    }
}
