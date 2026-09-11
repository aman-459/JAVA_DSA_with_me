package Basics;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println("SI is: "+si);

    }

}
