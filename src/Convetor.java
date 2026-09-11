import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Convetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Indian rupees: ");
        float r = sc.nextFloat();
        float d = r / 95.6f;
        System.out.println(d+" dollor in "+r+" rupees");
    }
}
