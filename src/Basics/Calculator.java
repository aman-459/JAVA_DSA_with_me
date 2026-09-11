package Basics;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter operation (+, -, *, /): ");
        String opr = sc.nextLine();

        int result = 0;
        switch (opr) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("NaN");
                    return;
                } else {
                    result = a / b;
                }
            }
            case null, default -> System.out.println("Invalid Oprations");
        }
        System.out.println(result);
    }
}
