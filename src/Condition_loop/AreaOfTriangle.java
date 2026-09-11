package Condition_loop;

import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side length: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side length: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side length: ");
        int c = sc.nextInt();
        double s = (double) (a + b + c) /2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of Triangle is: "+area);
    }
}
