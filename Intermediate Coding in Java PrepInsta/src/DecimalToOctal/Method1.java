//Decimal to Octal Conversion
package DecimalToOctal;

public class Method1 {
    private static void convert(int num) {
        int octalArray[] = new int[32];
        int i = 0;
        while (num > 0) {
            octalArray[i] = num % 8;
            num = num / 8;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalArray[j]);
    }

    public static void main(String[] args) {
        int decimal_num = 11;
        convert(decimal_num);
    }
}
