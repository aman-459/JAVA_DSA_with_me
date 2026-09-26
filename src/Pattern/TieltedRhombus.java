package Pattern;

public class TieltedRhombus {
    public static void main(String[] args) {
        int n = 5;
        tieltedRhombus(n);
    }

    private static void tieltedRhombus(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            if(i == 1 || i == n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for(int j = 2; j < n; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
