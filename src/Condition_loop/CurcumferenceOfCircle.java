package Condition_loop;

import java.util.Scanner;

public class CurcumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double cir = 6.14 * r;
        System.out.printf("Circumference of Circle is: %.2f", cir);
    }
}
