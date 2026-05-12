//Decimal to Octal Conversion
package DecimalToOctal;

public class Method2 {
    private static void convert(int num) {
        int octal = 0;
        int rem, i = 1;
        while (num != 0) {
            rem = num % 8;
            num /= 8;
            octal += rem * i;
            i *= 10;
        }
        System.out.println(octal);
    }

    public static void main(String[] args) {
        int decimal_num = 11;
        convert(decimal_num);
    }
}
