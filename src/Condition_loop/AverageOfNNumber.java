package Condition_loop;

import java.util.Scanner;

public class AverageOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '0' to stop input.");
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n == 0) {
                System.out.print("Average of "+count+" number is: "+sum/count);
                return;
            }
            sum += n;
            count += 1;
        }
    }
}
