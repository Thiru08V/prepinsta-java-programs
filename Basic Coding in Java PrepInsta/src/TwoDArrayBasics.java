//Implement 2D Array

import java.util.Scanner;
public class TwoDArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int NR = sc.nextInt(); //NR - NRows
        System.out.print("Enter Number of Columns: ");
        int NC = sc.nextInt(); //NC - NColumns

        int Arr[][] = new int[NR][NC];

        System.out.println("Enter the Items in the 2D Array: ");
        for(int i = 0; i < NR; i++){
            for(int j = 0; j < NC; j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Items in the 2D Array are: ");
        for(int i = 0; i < NR; i++){
            for(int j = 0; j < NC; j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
