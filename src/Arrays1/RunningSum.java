package Arrays1;

import java.util.Arrays;

// 1480. Running Sum of 1d Array Leetcode
public class RunningSum {
    public static int[] runningSum(int[] arr) {
        int[] ans = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }
}
