//Binary to Decimal Conversion
package BinaryToDecimal;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        String binary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        binary = sc.nextLine();
        /* Inbuilt function for Java */
        System.out.println(Integer.parseInt(binary, 2));
        sc.close();
    }
}
