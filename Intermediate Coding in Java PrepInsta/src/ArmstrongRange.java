//Program to print armstrong numbers in a given range

import java.util.Scanner;

public class ArmstrongRange {
    static int order(int Num) {
        int Length = 0;
        while (Num != 0) {
            Length++;
            Num = Num / 10;
        }
        return Length;
    }

    static void armstrong(int low, int high) {
        for (int num = low; num <= high; num++) {
            int sum = 0, temp, digit, len;
            temp = num;
            len = order(num);
            while (temp != 0) {
                digit = temp % 10;
                sum = (int) (sum + Math.pow(digit, len));
                temp /= 10;
            }
            if (sum == num)
                System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Lower Range : ");
        int low = sc.nextInt();

        System.out.print("Enter Upper Range : ");
        int high = sc.nextInt();

        System.out.println("Armstrong Numbers are : ");

        armstrong(low, high);

        sc.close();
    }
}
