//Decimal to Hexadecimal Conversion

public class DecimalToHex {
    private static void convert(int num) {
        char hexa[] = new char[100];
        int i = 0;
        while(num != 0) {
            int rem = 0;
            rem = num % 16;
            if(rem < 10) {
                hexa[i] = (char) (rem + 48);
                i++;
            }
            else {
                hexa[i] = (char) (rem + 55);
                i++;
            }
            num = num / 16;
        }
        for(int j = i - 1; j >= 0; j--)
            System.out.print(hexa[j]);
    }
    public static void main(String[] args) {
        int decimal_num = 892;
        convert(decimal_num);
    }
}
