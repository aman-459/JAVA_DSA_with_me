package Condition_loop;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit in Electricity meter Showed: ");
        double bill = sc.nextDouble();
        System.out.println(bill*10);

    }
}
