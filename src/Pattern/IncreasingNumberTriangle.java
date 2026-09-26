package Pattern;

public class IncreasingNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        numTri(n);
    }

    private static void numTri(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
