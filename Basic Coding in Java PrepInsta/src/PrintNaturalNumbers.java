//Printing First N Natural Numbers

import java.util.Scanner;
public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Num = scanner.nextInt();

        //int i = 1;
        //Using While Loop Structure:

        /*while(i <= Num){
            System.out.print(i + " ");
            i++;
        }*/

        //Using For Loop Structure:

        for(int i = 1; i <= Num ; i++){
            System.out.print(i + " ");
        }

        //Using Do-While Structure:

        /*do{
            System.out.print(i + " ");
            i++;
        }while(i <= Num);*/

        scanner.close();
    }
}
