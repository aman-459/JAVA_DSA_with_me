package Functions;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static int isMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static boolean isTriplet(int a, int b, int c) {
        int h = isMax(a, b, c);
        int base = 0;
        int per = 0;
        if(h != a && h != b) {
            base = a;
            per = b;
        } else if(h != a && h != c) {
            base = a;
            per = c;
        } else if(h != b && h != c) {
            base = b;
            per = c;
        }
        if(h*h != ((base*base)+(per*per))) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pythogorean Triplet.");
        System.out.print("Enter 1st side length: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side length: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side length: ");
        int c = sc.nextInt();
        if(isTriplet(a, b, c)) System.out.println("This is a Pythogorean Triplets.");
        else System.out.println("This is not a Pythogoran Triplets.");
    }
}
