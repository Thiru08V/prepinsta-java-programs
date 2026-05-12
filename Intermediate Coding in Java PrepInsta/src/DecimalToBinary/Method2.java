//Decimal to Binary Conversion
package DecimalToBinary;

public class Method2 {
    private static void convert(int num) {
        long binary = 0;
        int rem, i = 1;
        while (num != 0) {
            rem = num % 2;
            num /= 2;
            binary += rem * i;
            i *= 10;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        int decimal_num = 11;
        convert(decimal_num);
    }
}
