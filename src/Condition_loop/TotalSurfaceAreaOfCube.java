package Condition_loop;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double a = sc.nextDouble();
        double v = (double) 6*(a*a);
        System.out.printf("The total Surface Area of Cube is: %.2f",v);
    }
}
