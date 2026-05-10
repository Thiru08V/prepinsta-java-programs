//Implement 1D Array
//Array - Collection of Objects to be stored it in a contiguous(meaning adjacent memory locations) Format.
import java.util.Scanner;
public class OneDArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int N = sc.nextInt();
        
        int Arr[] = new int[N];
        System.out.println("Enter the Elements of the Array: ");

        //Using For Loop
        /*for(int i = 0; i < N; i++)
            Arr[i] = sc.nextInt();
        
        System.out.println("Array Elements are: ");
        for(int i = 0; i < N; i++)
            System.out.print(Arr[i] + " ");*/

        //Using While Loop
        int i = 0;
        while(i < N){
            Arr[i] = sc.nextInt();
            i++;
        }
        sc.close();
        System.out.println("Array Elements are: ");
        for(i = 0; i < N; i++)
            System.out.print(Arr[i] + " ");
        
        //sc.close();
    }
}
//If i <= N mean, when N = 4, we get Error Message as Array Index Out of Bounds Exception.