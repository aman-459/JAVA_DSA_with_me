package Condition_loop;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sell amount: ");
        double tsa = sc.nextDouble();
        System.out.print("Enter commission amount: ");
        double c = sc.nextDouble();
        double cP = (c/tsa)*100;
        System.out.printf("Commission Percentage is: %.2f%%", cP);

        sc.close();
    }
}
