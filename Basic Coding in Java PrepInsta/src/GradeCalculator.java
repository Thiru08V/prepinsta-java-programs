//Grading Scheme in Java

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks:");
        int Marks = sc.nextInt();

        /*if(Marks < 0 || Marks > 100){
            System.out.println("Invalid");
        }
        else if(Marks < 50){
            System.out.println("Grade F");
        }
        else if(Marks >= 50 && Marks < 60 ){
            System.out.println("Grade D");
        }
        else if(Marks >=60 && Marks <70){
            System.out.println("Grade C");
        }
        else if(Marks >= 70 && Marks <80){
            System.out.println("Grade B");
        }
        else if(Marks >= 80 && Marks <90){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Grade A++");
        }*/

        if(Marks >= 0 && Marks < 50){
            System.out.println("Grade F");
        }
        else if(Marks >= 50 && Marks < 60 ){
            System.out.println("Grade D");
        }
        else if(Marks >=60 && Marks <70){
            System.out.println("Grade C");
        }
        else if(Marks >= 70 && Marks <80){
            System.out.println("Grade B");
        }
        else if(Marks >= 80 && Marks <90){
            System.out.println("Grade A");
        }
        else if(Marks >= 90 && Marks <= 100){
            System.out.println("Grade A+");
        }
        else{
            System.out.println("Invalid");
        }
        
        sc.close();

    }
}
