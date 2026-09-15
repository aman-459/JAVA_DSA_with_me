package Arrays1;

import java.util.Arrays;

// Build Array from Permutation  Leetcode 1929
public class Concatenation {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    public static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2*arr.length];
        for(int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[n+i] = arr[i];
        }
        return ans;
    }
}
