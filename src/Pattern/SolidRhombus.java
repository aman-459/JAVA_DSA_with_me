package Pattern;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        solidRhombus(n);
    }

    private static void solidRhombus(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        halfRhombus(n);
    }

    private static void halfRhombus(int n) {
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
