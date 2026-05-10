//Learning Break Statement

import java.util.Scanner;
public class BreakStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Low Number:");
        int Low = sc.nextInt();
        System.out.print("Enter the High Number:");
        int High = sc.nextInt();
        sc.close();
        //Using While Loop Structure
        /*int i = Low;
        while(i <= High){
            System.out.print(i + " ");
            if(i % 13 == 0)
                break;
            i++;
        }*/

        //Using For Loop Structure

        for(int i = Low; i <= High; i++){
            System.out.print(i + " ");
            if(i % 13 == 0)
                break;
        }
    }
}
