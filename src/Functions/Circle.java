package Functions;

import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.printf("Area of Circle is: %.2f",area(r));
        System.out.printf("\nCircumference of Circle is: %.2fcm",circumference(r));
        sc.close();
    }
    public static double area(double r) {
        return 3.14 * r * r;
    }

    public static double circumference(double r) {
        return 6.14 * r;
    }
}
