//Greatest of Two Numbers

import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int Num1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int Num2 = sc.nextInt();

        /*if(Num1 > Num2)
            System.out.println(Num1 + " is greater than " + Num2);
        else if(Num2 > Num1)
            System.out.println(Num2 + " is greater than " + Num1);
        else
            System.out.println("Both Numbers are Equal");*/
        
        //Using Ternary Operator

        /*int Largest = 0;
        if(Num1 == Num2)
            System.out.println("Both Numbers are Equal");
        else
            Largest = (Num1 > Num2) ? Num1 : Num2;
        System.out.println(Largest + " is the Largest");*/

        //Using Math.max Library Structure
        if(Num1 == Num2)
            System.out.println("Both Numbers are Equal");
        else
            System.out.println(Math.max(Num1, Num2) + " is Greater");
        
        sc.close();
    }
}
