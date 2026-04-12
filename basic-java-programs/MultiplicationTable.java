//Multiples / Table of a Number

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int X = sc.nextInt();
        Table(X);
        sc.close();
    }
    static void Table(int A){
        /*for(int i = 1 ; i <=10 ; i++){
            System.out.println(A + " * " + i + " = " + (A * i));
        }*/

        //Using While Loop Structure

        int i = 1;
        while(i <= 10){
            System.out.println(A + " * " + i + " = " + (A * i));
            i++;
        }
    }
}
