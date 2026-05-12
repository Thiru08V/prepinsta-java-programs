//Sum of First N Natural Numbers

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int N = sc.nextInt();
        //int Sum = 0;
        //Time Complexity:O(n):-
        /*for(int i = 1; i <= N; i++){
            Sum += i;
        }*/
        //System.out.print(Sum);
        //Time Complexity:O(1):-
        int Sum = N * (N + 1) / 2;
        System.out.print(Sum);
        sc.close();
    }
}
