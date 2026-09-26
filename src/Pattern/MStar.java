package Pattern;

public class MStar {
    public static void main(String[] args) {
        int n = 5;
        mStar(n);
    }

    private static void mStar(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j = 2; j < 2*i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");

            for(int j = 1; j <= 2*(n-i)-1; j++) {
                System.out.print("  ");
            }
            if(i != n) System.out.print("* ");

            for(int j = 2; j < 2*i-1; j++) {
                System.out.print("  ");
            }
            if(i!=1) System.out.print("* ");
            System.out.println();
        }
    }
}
