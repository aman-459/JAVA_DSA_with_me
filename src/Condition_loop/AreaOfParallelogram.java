package Condition_loop;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        int area = h * b;
        System.out.println("The Area of Parallelogram is: "+area);
    }
}
