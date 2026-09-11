//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find isArmstrong or not: ");
        int n = sc.nextInt();
        String st = String.valueOf(n);
        int sum = 0;
        int num = n;
        while(num > 0) {
            int rem = num%10;
            int sqr = 1;
            for(int i = 1; i <= st.length(); i++) {
                sqr *= rem;
            }
            sum += sqr;
            num /= 10;
        }
        if(sum == n) {
            System.out.println(n+" is Armstrong Number.");
        } else {
            System.out.println(n+" is not Armstrong Number.");
        }

    }
}
 // 123 => 1*1*1 + 2*2*2 + 3*3*3