//Linear Search

public class LinearSearch {
    private static void linearSearch(int arr[], int item) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == item) {
                System.out.println(item + " found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 15, 21, -3, 7};
        int item = 21;
        linearSearch(arr, item);
    }
}
