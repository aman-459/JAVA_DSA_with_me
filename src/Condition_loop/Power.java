package Condition_loop;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double b = sc.nextDouble();
        System.out.print("Enter Power: ");
        double p = sc.nextDouble();
        double pow = 1;
        if(b == 0 && p == 0) {
            System.out.println("NaN");
            return;
        }
        for(int i = 1; i <= p; i++) {
            pow *= b;
        }
        System.out.print(pow);
        sc.close();
    }
}
