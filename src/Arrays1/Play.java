package Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Play {
    public static void main(String[] args) {
        //int n = 122222220;
        //String st = n+"";
        int k = 1;
        int[] arr = {9,9,9,6,2,0,3,9,9,9,9,9,9,9};
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(addToArrayForm(arr, k));
    }
    public static List addToArrayForm(int[] num, int k) {
        List res = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum = (sum * 10) + num[i];
        }
        System.out.println(sum);
        long ts = sum + k;
        System.out.println(ts);
        String st = ts+"";
        for(int i = st.length(); i > 0; i--) {
            res.add(0, ts%10);
            ts /= 10;
        }
        System.out.println(res.size());
        System.out.println(res.get(0));
        return res;

    }
}
