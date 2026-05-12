package BubbleSort;

public class Method1 {
    private static void bubbleSort(int arr[]) {
        int i, j;
        int len = arr.length;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 3, 1, 9, 8, 2, 4, 7 };
        System.out.println("Before Bubble Sort : ");
        display(array);
        bubbleSort(array);
        System.out.println("After Bubble Sort : ");
        display(array);
    }

    // Function to print array :
    private static void display(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
