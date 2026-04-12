//Printing All Operation

import java.util.Scanner;
public class BasicCalculatorPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number X:");
        int X = sc.nextInt();
        System.out.print("Enter Number Y:");
        int Y = sc.nextInt();

        System.out.println("The Addition of " + X + " and " + Y + " is:" + (Add(X,Y)));
        System.out.println("The Subtraction of " + X + " and " + Y + " is:" + (Subtract(X,Y)));
        System.out.println("The Multiplication of " + X + " and " + Y + " is:" + (Multiply(X,Y)));
        System.out.println("The Division of " + X + " and " + Y + " is:" + (Divide(X,Y)));
        System.out.println("The Modulus of " + X + " and " + Y + " is:" + (Modulus(X,Y)));
        System.out.println("The Power of " + X + " and " + Y + " is:" + (Power(X,Y)));

        sc.close();
    }

    static int Add(int A, int B) {
        int Add = A + B;
        return Add;
    }

    static int Subtract(int A, int B) {
        int Sub = A - B;
        return Sub;
    }

    static int Multiply(int A, int B) {
        int Mul = A * B;
        return Mul;
    }

    static float Divide(int A, int B) {
        float Divide = (float) A / B;
        return Divide;
    }

    static int Modulus(int A, int B) {
        int Remainder = A % B;
        return Remainder;
    }

    static double Power(int A, int B) {
        double Power = Math.pow(A, B);
        return Power;
    }
    
}
