package Pattern;

public class InvertedHollowTriangle {
    public static void main(String[] args) {
        int n = 5;
        invertedHollowTri(n);
    }

    private static void invertedHollowTri(int n) {
        for(int i = 1; i <= 2*n-1; i++) {
            System.out.print("*");
        }
        for(int i = n; i >= 1; i--) {
            for(int  j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 2; j < 2*i-1; j++) {
                System.out.print(" ");
            }
            if(i!=1) System.out.print("*");
            System.out.println();
        }

    }
}
