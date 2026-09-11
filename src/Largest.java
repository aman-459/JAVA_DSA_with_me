import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        if(a > b) {
            System.out.print(a+" is larger than "+b);
        } else if (a < b) {
            System.out.println(b+" is larger than "+a);
        } else {
            System.out.println(a+ " and "+b+" are equal");
        }
    }
}
