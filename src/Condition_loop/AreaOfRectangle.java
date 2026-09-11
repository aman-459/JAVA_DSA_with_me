package Condition_loop;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("The Area of Rectangle is: "+area);
    }
}
