package Pattern;

public class KiteNumber {
    public static void main(String[] args) {
        int n = 5;
        kiteNum(n);
    }

    private static void kiteNum(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            int row = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(row+" ");
                row--;
            }
            if(i!=1) {
                int count = 2;
                for(int j = 1; j < i; j++) {
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
