//Sum of Numbers in a Given Range

import java.util.Scanner;

public class SumOfPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Low Number:");
        int A = sc.nextInt();
        System.out.print("Enter a High Number:");
        int B = sc.nextInt();
        //Time Complexity:O(n):-
        /*int Sum = 0;
        for(int i = A; i <= B; i++){
            Sum += i;
        }*/
        //System.out.print(Sum);
        //Time Complexity:O(1):-
        //int Sum = B * (B + 1) / 2 - A * (A + 1) / 2 + A;  //Or
        int Sum = (B - A + 1) * (A + B) / 2;
        System.out.print(Sum);
        sc.close();
    }
}
