//Voting System Code 

import java.util.Scanner;
public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int Age = sc.nextInt();

        //Using If-Else Structure:

        /*if(Age >= 18)
            System.out.println("Vote");
        else
            System.out.println("Cannot Vote");*/

        // why this is wrong ? Return type should be int || but we are not returning anything thus void
        //int temp = age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote");
        // unlike C++ / C we can't simply use ternary as
        //  age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote");

        //Using Ternary Operator

        String Result = Age >=18 ? "Vote" : "Cannot Vote";
        System.out.println(Result);

        sc.close();
    }
}
