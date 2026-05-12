//Octal to Decimal Conversion
package OctalToDecimal;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        String octalNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Octal Number : ");
        octalNumber = sc.nextLine();
        int base = 8;
        System.out.println(Integer.parseInt(octalNumber, base));
        sc.close();
    }
}
