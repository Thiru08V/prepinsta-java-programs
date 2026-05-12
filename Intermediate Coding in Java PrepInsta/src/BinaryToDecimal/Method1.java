//Binary to Decimal Conversion
package BinaryToDecimal;

import java.util.Scanner;

public class Method1 {
    static long convert(long num) {
        int i = 0, decimal = 0;
        while (num != 0) {
            long digit = num % 10;
            decimal += digit * Math.pow(2, i);
            num /= 10;
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextLong();
        System.out.println(convert(num));
        sc.close();
    }
}
