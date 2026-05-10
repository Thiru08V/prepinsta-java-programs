//Greatest of Three Numbers

import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int Num1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int Num2 = sc.nextInt();
        System.out.print("Enter the Third Number:");
        int Num3 = sc.nextInt();

        /*if(Num1 >= Num2 && Num1 >= Num3)
            System.out.println(Num1 + " is the Greatest Number");
        else if(Num2 >= Num1 && Num2 >= Num3)
            System.out.println(Num2 + " is the Greatest Number");
        else
            System.out.println(Num3 + " is Greatest Number");*/

        //Using Ternary Operator
        /*int Temp = Num1 > Num2 ? Num1 : Num2;
        int Result = Temp > Num3 ? Temp : Num3;
        System.out.println(Result + " is Greatest Number");*/

        //Using Math.max Library Structure
        int Result = Math.max(Num1, Math.max(Num2, Num3));
        System.out.println(Result + " is Greatest Number");

        sc.close();
    }
}
