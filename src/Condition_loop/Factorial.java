package Condition_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int factrial = 1;
        if(n == 0) {
            System.out.print(1);
            return;
        }
        for(int i = 1; i <= n; i++) {
            factrial *= i;
        }
        System.out.println(factrial);
    }
}
