package Condition_loop;

import java.util.Scanner;
// Reverse String
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter somethings: ");
        String str = sc.nextLine();
//        char[] st = str.toCharArray();
//        int i = 0;
//        int j = st.length-1;
//        while(i <= j) {
//            char c = st[i];
//            st[i] = st[j];
//            st[j] = c;
//            i++;
//            j--;
//        }
//        System.out.println(st);


//        // other method

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
