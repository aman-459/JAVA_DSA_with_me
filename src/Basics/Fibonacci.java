package Basics;//To calculate Basics.Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number where up to find Fibonacci Series: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i <= n; i++) {
            int ans = a + b;
            System.out.print(a+" ");
            a = b;
            b = ans;
        }
    }
}

//Basics.Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
