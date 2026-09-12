package Condition_loop;

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n == 0) {
                System.out.print("Largest: "+max);
                return;
            }
            if(n > max) {
                max = n;
            }
        }
    }
}
