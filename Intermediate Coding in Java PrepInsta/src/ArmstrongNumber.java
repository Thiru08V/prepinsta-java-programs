//Program to check if a given number is armstrong number or not
import java.util.Scanner;

public class ArmstrongNumber {
    static int order(int Num) {
        int Length = 0;
        while(Num != 0){
            Length++;
            Num = Num / 10;
        }
        return Length;
    }
    static boolean armstrong(int Num, int Length) {
        int Sum = 0, Temp, Digit;
        Temp = Num;
        //Loop to extract digit, find cube and add to sum
        while(Temp != 0) {
            Digit = Temp % 10;
            Sum = (int) (Sum + Math.pow(Digit, Length));
            Temp /= 10; 
        }
        return Num == Sum;
    }
    public static void main(String[] args) {
        int Num, Length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        Num = sc.nextInt();
        //Function to get Order(Length)
        Length = order(Num);
        //Check if Armstrong
        if(armstrong(Num, Length))
            System.out.println(Num + " is a Armstrong");
        else
            System.out.println(Num + " is not Armstrong");
        sc.close();
    }
}
