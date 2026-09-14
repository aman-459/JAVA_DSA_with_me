package Functions;

// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println(sum(a, b));
        sc.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
