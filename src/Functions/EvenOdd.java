package Functions;

// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        boolean ans = isEven(a);
        if(ans) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
