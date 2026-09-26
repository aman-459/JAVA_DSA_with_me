package Pattern;

public class CountTriangle {
    public static void main(String[] args) {
        int n = 6;
        countTri(n);
    }

    private static void countTri(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
}
