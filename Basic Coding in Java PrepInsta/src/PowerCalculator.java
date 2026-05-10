//N Power of a Number

import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of Base:");
        double Base = sc.nextDouble();
        System.out.print("Enter the Value of Exponent:");
        double Exp = sc.nextDouble();
        sc.close();
        //Using Math.max Library Structure
        //System.out.println("Answer = " + Math.pow(Base, Exp));

        //Using While Loop
        double Result = 1;
        /*int i = 1; //Here Using One Extra Variable.
        while (i <= Exp) {
            Result = Result * Base;
            i++;
        }
        System.out.println("Answer = " + Result);*/

        //Without Using One Extra Variable

        /*while (Exp != 0) {
            Result = Result * Base;
            --Exp;
        }
        System.out.println("Answer = " + Result);*/

        //Using For Loop

        /*for(int i = 1; i <= Exp; i++) //Here Using One Extra Variable.
            Result = Result * Base;
        System.out.println("Answer = " + Result);*/

        //Without Using One Extra Variable
        /*for(; Exp != 0; --Exp)
            Result = Result * Base;
        System.out.println("Answer = " + Result);*/

        //We Can Start this Itertion From i = 0 too and the Condition is i < Exp, For Using One Extra Variable 'i'

        for(int i = 0; i < Exp; i++) //Here Using One Extra Variable.
            Result = Result * Base;
        System.out.println("Answer = " + Result);

        int i = 0; //Here Using One Extra Variable.
        while (i < Exp) {
            Result = Result * Base;
            i++;
        }
        System.out.println("Answer = " + Result);
    }
}
