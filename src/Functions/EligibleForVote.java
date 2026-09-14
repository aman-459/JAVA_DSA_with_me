package Functions;
// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        boolean eligible = isEligible(age);
        if(eligible) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Not eligible for voting.");
        }
    }

    public static boolean isEligible(int a) {
        return a >= 18;
    }
}
