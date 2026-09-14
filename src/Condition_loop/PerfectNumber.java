package Condition_loop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("This is Perfect number.");
        } else {
            System.out.println("This is not Perfect number.");
        }

    }
}
