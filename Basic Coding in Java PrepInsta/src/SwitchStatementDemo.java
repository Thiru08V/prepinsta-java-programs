//Switch Statement

import java.util.Scanner;
public class SwitchStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice:");
        int Option = sc.nextInt();
        sc.close();
        switch(Option){
            case 1:
                System.out.println("Option 1 Selected");
                break;
            case 2:
                System.out.println("Option 2 Selected");
                break;
            case 3:
                System.out.println("Option 3 Selected");
                break;
            case 4:
                System.out.println("Option 4 Selected");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
