//Number is Even or Odd

import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Num = sc.nextInt();

        //Using If-Else

        /*if(Num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");*/
        
        //Using Ternary Operator

        /*String EvenOdd = (Num % 2 == 0) ? "Even" : "Odd";
        System.out.println(Num + " is " + EvenOdd);*/

        //Using BitWise Operator

        if(isEven(Num) == true)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
        sc.close();
    }
    public static boolean isEven(int Num){
        if((Num & 1) == 0)
            return true;
        else
            return false;
    }
}

/*
isEven Function:

public static boolean isEven(int Num){
    if((Num & 1) == 0)
        return true;
    else
        return false;
}

This uses bitwise AND operator (&) to check the last bit of the number:

In binary, even numbers end with 0.

Odd numbers end with 1.

(Num & 1) isolates the last bit:

If last bit = 0 → even.

If last bit = 1 → odd.

Case 1: Input = 6 (Even)
Binary of 6 → 110

(6 & 1) → 110 & 001 → 000 → 0

So, (6 & 1) == 0 → true → Even 

Case 2: Input = 7 (Odd)
Binary of 7 → 111

(7 & 1) → 111 & 001 → 001 → 1

So, (7 & 1) == 0 → false → Odd

Case 3: Input = 0 (Even)
Binary of 0 → 000

(0 & 1) → 000 & 001 → 000 → 0

So, (0 & 1) == 0 → true → Even

 */
