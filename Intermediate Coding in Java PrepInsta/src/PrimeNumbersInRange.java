//Prime Numbers in a Given Range
import java.util.Scanner;

public class PrimeNumbersInRange {
    static boolean isPrime(int N) {
        if (N <= 1)
            return false;
        else if (N == 2)
            return true;
        else if (N % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range bound : ");
        int a = sc.nextInt();
        System.out.print("Enter upper range bound : ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        sc.close();
    }
}
