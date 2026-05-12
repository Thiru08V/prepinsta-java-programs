//Hexadecimal to Decimal Conversion
package HexToDecimal;

import java.util.Scanner;

public class Method1 {
    private static int convert(String hex) {
        int len = hex.length();
        int decimal = 0, POS = 0;
        for(int i = len - 1; i >= 0; i--) {
            if(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
                int digit = hex.charAt(i) - 48;
                decimal += digit * Math.pow(16, POS);
                POS++;
            }
            else if(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                int digit = hex.charAt(i) - 55;
                decimal += digit * Math.pow(16, POS);
                POS++;
            }
        }
        return decimal;
    }
    public static void main(String[] args) {
        String hex;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Number : ");
        hex = sc.nextLine();
        System.out.println(convert(hex));
        sc.close();
    }
}
