package Pattern;

public class HollowKite {
    public static void main(String[] args) {
        int n = 5;
        hollowKite(n);
    }

    private static void hollowKite(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 2; j < 2*i-1; j++) {
                System.out.print(" ");
            }
            if(i != 1) System.out.print("*");
            System.out.println();
        }
        halfInvertedKite(n);
    }

    private static void halfInvertedKite(int n) {
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 2; j < 2*i-1; j++) {
                System.out.print(" ");
            }
            if(i != 1) System.out.print("*");
            System.out.println();
        }
    }
}
