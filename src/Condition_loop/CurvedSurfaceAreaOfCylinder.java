package Condition_loop;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circular base: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double pi = 3.14159;
        double v = (double) 2*(pi*r*h);
        System.out.printf("The Curved Surface Area of cylinder is: %.2f",v);
    }
}
