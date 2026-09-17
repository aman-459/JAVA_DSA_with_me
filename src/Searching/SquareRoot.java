package Searching;

public class SquareRoot {
    public static int mySqrt(int x) {
        int i = 0;
        int j = x;
        int result = 0;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            long sqr =(long) mid * mid;
            if(sqr > x) j = mid - 1;
            else {
                result = mid;
                i = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 19;
        System.out.println(mySqrt(x));
    }
}
