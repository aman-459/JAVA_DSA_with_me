package Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] idx = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(arr, idx)));

    }

    public static int[] createTargetArray(int[] arr, int[] idx) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            ans.add(idx[i], arr[i]);
        }
        int[] target = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            target[i] = ans.get(i);
        }
        return target;
    }
}
