//Hexadecimal to Decimal Conversion
package HexToDecimal;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        String hexNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Number : ");
        hexNumber = sc.nextLine();
        int base = 16;
        System.out.println(Integer.parseInt(hexNumber, base));
        sc.close();
    }
}
