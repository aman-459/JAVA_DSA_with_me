package Condition_loop;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter diagonal2: ");
        int d2 = sc.nextInt();
        double area = 0.5 * d1 * d2;
        System.out.println("The Area of Rhombus is: "+area);
    }
}
