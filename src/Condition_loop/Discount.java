package Condition_loop;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of Product: ");
        double p = sc.nextDouble();
        double disP = p - (p * 0.2);
        System.out.printf("The discounted price of this product is: %.2f", disP);
    }
}
