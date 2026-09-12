package Condition_loop;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n == 0) {
                System.out.print("sum: "+sum);
                return;
            }
            sum += n;
        }
    }
}
