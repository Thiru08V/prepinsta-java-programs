//Program to find HCF/GCD of a number
package HCF;

public class Method2 {
    public static void main(String[] args) {
        int num1 = 36, num2 = 12;
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        System.out.print("The HCF of two numbers is : " + num1);
    }
}
