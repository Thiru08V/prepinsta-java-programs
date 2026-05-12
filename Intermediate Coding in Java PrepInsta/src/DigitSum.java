//Program to find sum of digits of a number
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Num = sc.nextInt();
        int OriginalNum = Num;
        int Sum = 0;
        while(Num != 0) {
            Sum += Num % 10;
            Num = Num / 10;
        }
        System.out.printf("The Sum of the %d is : %d", OriginalNum, Sum);
        sc.close();
    }
}
