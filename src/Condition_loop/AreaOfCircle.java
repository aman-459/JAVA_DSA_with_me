package Condition_loop;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi*r*r;
        System.out.println("The Area of Circle is: "+area);
    }
}
