//Octal to Decimal Conversion
package OctalToDecimal;

import java.util.Scanner;

public class Method1 {
    static long convert(long num) {
        int i = 0, decimal = 0;
        int base = 8;
        while (num != 0) {
            long digit = num % 10;
            decimal += digit * Math.pow(base, i);
            num /= 10;
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Octal Number : ");
        num = sc.nextLong();
        System.out.println(convert(num));
        sc.close();
    }
}
