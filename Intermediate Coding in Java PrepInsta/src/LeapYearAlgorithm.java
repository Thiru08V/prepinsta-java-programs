//Check If Leap Year or Not

import java.util.Scanner;
public class LeapYearAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int Year = sc.nextInt();
        System.out.print("You Entered a Year:" + Year + "\n");

        /*if(Year % 400 == 0){
            System.out.println("It is a Leap Year");
        }
        else if(Year % 4 == 0 && Year % 100 != 0){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year.");
        }*/

        if ((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 != 0)) {
            System.out.printf("%d is a Leap Year", Year);
        } else {
            System.out.printf("%d is not a Leap Year", Year);
        }
        
        sc.close();
    }
}
