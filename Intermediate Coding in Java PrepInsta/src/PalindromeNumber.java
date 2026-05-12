//Program to check if a number is palindrome or not
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int Num, Reverse = 0, Rem, Temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        Num = sc.nextInt();
        Temp = Num;
        while(Temp != 0) {
            Rem = Temp % 10;
            Reverse = Reverse * 10 + Rem;
            Temp /= 10;
        }
        if(Num == Reverse)
            System.out.println(Num + " is a Palindrome");
        else
            System.out.println(Num + " is not a Palindrome");
        sc.close();
    }
}
