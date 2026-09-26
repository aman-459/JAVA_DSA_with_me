package Pattern;

public class NumberRhombus {
    public static void main(String[] args) {
        int n = 5;
        numRhombus(n);
    }

    private static void numRhombus(int n) {
        for(int i = 1; i <= n; i++) {
            int t = i;
            int s = 2;
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                if(t > 0) {
                    System.out.print(t);
                    t--;
                } else {
                    System.out.print(s);
                    s++;
                }
            }
            System.out.println();
        }
        invertedRhombus(n);
    }

    private static void invertedRhombus(int n) {
        for(int i = n; i >= 1; i--) {
            int t = i;
            int s = 2;
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                if(t > 0) {
                    System.out.print(t);
                    t--;
                } else {
                    System.out.print(s);
                    s++;
                }
            }
            System.out.println();
        }
    }
}
