//Program to print prime factors of a number
package PrimeFactors;

public class Method2 {
    static void primeFactors(int num) {
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num = num / 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 2)
            System.out.print(num);
    }

    public static void main(String[] args) {
        int num = 1716;
        primeFactors(num);
    }
}
