package Condition_loop;

import java.util.Scanner;

public class ParimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of parallelogram: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of parallelogram: ");
        double b = sc.nextDouble();
        double pri = 2*(l+b);
        System.out.printf("The perimeter of Parallelogram is: %.2f", pri);
    }
}
