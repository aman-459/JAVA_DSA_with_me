package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] arr, int tar) {
        int i = 0;
        int j = arr.length-1;
        while(i <= j) {
            int mid = i + (j - i)/2;
            if(arr[i]+arr[j] == tar) {
                return new int[] {i+1, j+1};
            } else if(arr[i]+arr[j] > tar) j--;
            else i++;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(arr, tar)));
    }
}
