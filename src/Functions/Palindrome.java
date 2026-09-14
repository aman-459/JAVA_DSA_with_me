package Functions;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        if(n<0) n *= (-1);
        String st = String.valueOf(n);
        int i = 0, j = st.length()-1;
        while (i <= j) {
            if(st.charAt(i++) != st.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)) System.out.println("This is Palindrome.");
        else System.out.println("This is not a Palindrome.");
    }
}
