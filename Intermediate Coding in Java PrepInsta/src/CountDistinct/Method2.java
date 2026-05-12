package CountDistinct;

public class Method2 {
    static int countDistinct(int array[], int size) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            int flag = 0;
            for(int j = i + 1; j < size; j++) {
                if(array[i] == array[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
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
