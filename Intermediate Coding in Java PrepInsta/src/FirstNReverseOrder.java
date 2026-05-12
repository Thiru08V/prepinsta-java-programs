//Print First N Natural Numbers in Reverse Order

import java.util.Scanner;

public class FirstNReverseOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int N = sc.nextInt();
        //Using a For Loop
        /*
        for(int i = N; i > 0; i--){
            System.out.print(i + " ");
        }
        */

        //Using While Loop
        int i = N;
        while(i > 0){
            System.out.print(i + " ");
            i--;
        }

        sc.close();
    }
}
