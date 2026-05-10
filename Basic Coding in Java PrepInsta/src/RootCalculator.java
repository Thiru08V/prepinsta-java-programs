//Square Root and Cube Root in Java

import java.util.Scanner;
public class RootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Square Root : ");
        int X = sc.nextInt();
        //System.out.println("The Square Root of " + X + " is : " + SquareRoot(X));
        System.out.print("Enter a Number for Cube Root : ");
        int Y = sc.nextInt();
        //System.out.println("The Cube Root of " + Y + " is : " + CubeRoot(Y));

        // OR You Can Write these below code to avoid creating another functions:

        System.out.println("The Square Root of " + X + " is : " + Math.sqrt(X));
        System.out.println("The Cube Root of " + Y + " is : " + Math.cbrt(Y));

        sc.close();
    }
    /*static double SquareRoot(int A){
        double SQ = Math.sqrt(A);
        return SQ;
    }
    static double CubeRoot(int B){
        double CB = Math.cbrt(B);
        return CB;
    }*/
}
