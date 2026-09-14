package Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if(ans) System.out.println("This is a prime number.");
        else System.out.println("This is not a prime number.");
        sc.close();
    }

    public static boolean isPrime(int a) {
        if(a == 1) return false;
        if(a == 2) return true;
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}
