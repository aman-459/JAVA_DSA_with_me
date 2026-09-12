package Condition_loop;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double pi = 3.14159;
        double v = (double) 4/3*pi*r*r*r;
        System.out.printf("The Volume of S[here is: %.3f",v);
    }
}
