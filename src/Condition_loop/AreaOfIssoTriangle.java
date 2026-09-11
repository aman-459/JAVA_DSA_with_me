package Condition_loop;

import java.util.Scanner;

public class AreaOfIssoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter equal side length: ");
        int a = sc.nextInt();
        System.out.print("Enter 3rd side length: ");
        int b = sc.nextInt();
        double h = Math.sqrt((a*a)-((b/2.0)*(b/2.0)));
        double area = 0.5*b*h;
        System.out.println("The area of Isosceles Triangle is: "+area);
    }
}
