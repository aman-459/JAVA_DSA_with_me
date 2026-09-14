package Condition_loop;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for stop input.");
        double cgpa = 0;
        int count = 0;
        double sum = 0;
        while(true) {
            System.out.print("Enter Subject marks: ");
            double p = sc.nextDouble();
            if(p == 0) {
                cgpa = sum/count;
                System.out.printf("The Average Marks is %.2f", cgpa);
                return;
            }
            sum += p;
            count++;
        }
    }
}
