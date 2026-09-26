package Pattern;

public class RectangleRhombus {
    public static void main(String[] args) {
        int n = 5;
        invertedRectangleRhombus(n);
    }

    private static void invertedRectangleRhombus(int n) {
        for(int i = n; i >= 1; i--) {
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
        rectangleRhombus(n);
    }

    private static void rectangleRhombus(int n) {
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
    }
}
