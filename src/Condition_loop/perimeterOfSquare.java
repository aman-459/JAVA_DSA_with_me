package Condition_loop;

import java.util.Scanner;

public class perimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        double s = sc.nextDouble();
        double pri = 4*s;
        System.out.printf("The perimeter of Square is: %.2f", pri);
    }
}
