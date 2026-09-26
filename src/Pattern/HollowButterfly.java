package Pattern;

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;
        hollowButterfly(n);
    }

    private static void hollowButterfly(int n) {
        mStar(n);
        wStar(n);
    }

    private static void mStar(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print("* ");
            for(int j = 2; j <= i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");

            for(int j = 1; j <= 2*(n-i)-1; j++) {
                System.out.print("  ");
            }
            if(i!=n) System.out.print("* ");

            for(int j = 2; j <= i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");

            System.out.println();
        }
    }

    private static void wStar(int n) {
        for(int i = n; i >= 1; i--) {
            System.out.print("* ");
            for(int j = 2; j <= i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");

            for(int j = 1; j <= 2*(n-i)-1; j++) {
                System.out.print("  ");
            }
            if(i!=n) System.out.print("* ");

            for(int j = 2; j <= i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");

            System.out.println();
        }
    }
}
