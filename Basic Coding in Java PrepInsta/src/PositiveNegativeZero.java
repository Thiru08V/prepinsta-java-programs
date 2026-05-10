//Positive / Negative Number In Java

import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Num = sc.nextInt();

        //Else-If Structure:

        /*if(Num > 0)
            System.out.println("Positive");
        else if(Num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");*/
        
        //Nested If-Else Structure:

        /*if(Num >= 0){
            if(Num == 0)
                System.out.println("Zero");
            else
                System.out.println("Positive");
        }
        else
            System.out.println("Negative");*/
        
        //Ternary Operator Structure

        if(Num == 0)
            System.out.println("zero");
        else{
            String Result = Num > 0 ? "Positive Number" : "Negative Number";
            System.out.println(Result);
        }
        sc.close();
    }
}
