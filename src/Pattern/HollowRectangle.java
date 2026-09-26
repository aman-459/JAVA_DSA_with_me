package Pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        int l = 4;
        int b = 5;
        hollowRectangle(l, b);
    }

    public static void hollowRectangle(int l, int b) {
        for(int i = 1; i <= b; i++) {
            if(i == 1 || i == b) {
                for(int j = 1; j <= l; j++) {
                    System.out.print("*");
                }
            } else {
                for(int j = 1; j <= l; j++) {
                    if(j == 1 || j == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
