//Learning Continue Statement

import java.util.Scanner;
public class ContinueStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Low Number:");
        int Low = sc.nextInt();
        System.out.print("Enter the High Number:");
        int High = sc.nextInt();
        sc.close();

        //Using For Loop Structure
        for (int i = Low; i <= High; i++) {
            if (i % 5 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}
