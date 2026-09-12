package Condition_loop;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circular base: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double pi = 3.14159;
        double v = (pi*r*r*h);
        System.out.printf("The Volume of cylinder is: %.3f",v);
    }
}
