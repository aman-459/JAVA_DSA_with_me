package Condition_loop;

public class SubTheProductAndSumOfDigitsOfInteger {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int product = 1;
        while(n > 0) {
            int rem = n%10;
            sum += rem;
            product *= rem;
            n /=10;
        }
        //return product - sum;
        System.out.println(product - sum);
    }
}
