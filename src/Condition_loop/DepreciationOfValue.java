package Condition_loop;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of product: ");
        double cost = sc.nextDouble();
        System.out.print("Enter Time period: ");
        int time = sc.nextInt();
        System.out.print("Enter Salage Value: ");
        double sal = sc.nextDouble();
        double dep = (cost - sal) / time;
        System.out.printf("The Depreciation of Value is: %.2f", dep);
    }
}
