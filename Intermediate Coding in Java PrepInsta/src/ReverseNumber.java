//Program to reverse a given number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Num = sc.nextInt();
        int OriginalNum = Num;
        int Reverse = 0, Rem;
        while(Num != 0) {
            Rem = Num % 10;
            Reverse = Reverse * 10 + Rem;
            Num /= 10;
        }
        System.out.printf("The Reverse of the %d is : %d", OriginalNum, Reverse);
        sc.close();
    }
}
