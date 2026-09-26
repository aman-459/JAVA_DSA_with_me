package Pattern;

public class ButterFly {
    public static void main(String[] args) {
        int n = 10;
        butterFly(n);
    }

    private static void butterFly(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        halfButterFly(n);
    }

    private static void halfButterFly(int n) {
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
