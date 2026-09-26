package Pattern;

public class SnadClock {
    public static void main(String[] args) {
        int n = 5;
        sandClock(n);
    }

    private static void sandClock(int n) {
        for(int i = n; i >= 1; i--) {
            for(int  j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        fullTri(n);
    }

    private static void fullTri(int n) {
        for(int i = 1; i <= n; i++) {
            for(int  j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
