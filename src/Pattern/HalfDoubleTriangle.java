package Pattern;

public class HalfDoubleTriangle {
    public static void main(String[] args) {
        int n = 5;
        halfDoubleTri(n);
    }

    private static void halfDoubleTri(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        invertedTri(n);
    }

    private static void invertedTri(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
