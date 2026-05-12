//Decimal to Binary Conversion
package DecimalToBinary;

public class Method1 {
    private static void convert(int num) {
        int binaryArray[] = new int[32];
        int i = 0;
        while (num > 0) {
            binaryArray[i] = num % 2;
            num = num / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryArray[j]);
    }

    public static void main(String[] args) {
        int decimal_num = 11;
        convert(decimal_num);
    }
}
