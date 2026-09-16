package Arrays1;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr, n)));

    }
    public static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = 0; i < n; i++) {
            ans[j] = arr[i];
            ans[j+1] = arr[n+i];
            j += 2;
        }
        return ans;
    }
}
