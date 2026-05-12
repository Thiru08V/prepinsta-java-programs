//LCM of Two Numbers
package LCM;

public class Method4 {
    private static int getLCM(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        int lcm, temp = max;
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max += temp;
        }
        return lcm;
    }

    public static void main(String[] args) {
        int num1 = 36, num2 = 60;
        System.out.println("The LCM of two numbers is : " + getLCM(num1, num2));
    }
}
