package Condition_loop;

import java.util.Scanner;

public class AreaOfEquilateralTriagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("The Area of Equilateral Triangle is: "+area);
    }
}
