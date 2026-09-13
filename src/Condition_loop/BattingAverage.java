package Condition_loop;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total scores of player: ");
        double score = sc.nextDouble();
        System.out.print("Enter times he got lose: ");
        int lose = sc.nextInt();
        double dep = score / lose;
        System.out.printf("Batting Average: %.2f", dep);
    }
}
