package CountDistinct;

public class Method1 {
    public static void main(String[] args) {
        int arr[] = {30, 50, 30, 10, 20, 40, 10, 20};
        int n = arr.length;
        int visited[] = new int[n];
        int count_dis = 0;
        for(int i = 0; i < n; i++) {
            if(visited[i] == 0) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        visited[j] = 1;
                    }
                }
                count_dis++;
            }
        }
        System.out.print("Count of Distinct Elements : " + count_dis);
    }
}
