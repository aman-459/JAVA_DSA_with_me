package Condition_loop;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangular base: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangular base: ");
        double b = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double v = (double) 1/3*(l*b*h);
        System.out.printf("The Volume of Prism is: %.3f",v);
    }
}
