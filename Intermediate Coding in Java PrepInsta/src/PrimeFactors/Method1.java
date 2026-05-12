//Program to print prime factors of a number
package PrimeFactors;

public class Method1 {
    static void primeFactors(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 2)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int num = 1716;
        primeFactors(num);
    }
}
