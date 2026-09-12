package Condition_loop;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        double pri = 2*(l+b);
        System.out.printf("The perimeter of Rectangle is: %.2f", pri);
    }
}
