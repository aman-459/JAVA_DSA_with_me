package Functions;

import java.util.Scanner;

public class Resutl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        display(marks);
    }

    public static void display(int num) {
        if(num >= 91 && num <= 100) System.out.println("Your grade is: 'AA'");
        else if (num >= 81 && num <= 90) System.out.println("Your grade is: 'AB'");
        else if (num >= 71 && num <= 80) System.out.println("Your grade is: 'BB'");
        else if (num >= 61 && num <= 70) System.out.println("Your grade is: 'BC'");
        else if (num >= 51 && num <= 60) System.out.println("Your grade is: 'CD'");
        else if (num >= 41 && num <= 50) System.out.println("Your grade is: 'DD'");
        else if (num <= 40) System.out.println("FAIL");
        else System.out.println("Your enter marks");
    }
}
