package Functions;

// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println(prod(a, b));
        sc.close();
    }

    public static int prod(int a, int b) {
        return a * b;
    }
}
