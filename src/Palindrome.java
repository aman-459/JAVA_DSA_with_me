//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String st = String.valueOf(n);
        int i = 0, j = st.length()-1;
        while (i <= j) {
            if(st.charAt(i) != st.charAt(j)) {
                System.out.println("This is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println(n+" is palindrome");
    }
}
