package Arrays1;


public class RishestWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(max<sum) {
                max = sum;
            }
        }
        return max;
    }
}
