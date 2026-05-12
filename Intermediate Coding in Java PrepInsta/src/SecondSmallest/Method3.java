package SecondSmallest;

public class Method3 {
    private static void secSmallest(int arr[]) {
        int i, first, second;
        if (arr.length < 2) {
            System.out.println("Array has lesser than 2 items");
            return;
        }
        first = second = Integer.MAX_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("We don't have 2nd smallest item in array");
        else
            System.out.println("The 2nd smallest element is : " + second);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 14, -5, -8, 4 };
        secSmallest(arr);
    }
}
