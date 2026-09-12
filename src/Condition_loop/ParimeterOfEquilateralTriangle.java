package Condition_loop;

import java.util.Scanner;

public class ParimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Equilateral Triangle: ");
        double a = sc.nextDouble();
        double pri = 3 * a;
        System.out.printf("The perimeter of Equilateral Triangle is: %.2f", pri);
    }
}
