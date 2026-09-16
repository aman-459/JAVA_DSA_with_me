package Arrays1;

import java.util.ArrayList;

import java.util.List;

public class KidsWithCandiies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        System.out.println((kidsWithCandies(arr, extra)));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int large = max(candies);
        for(int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >= large) ans.add(true);
            else ans.add(false);
        }
        return ans;

    }

    public static int max(int[] candies) {
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            if(m < candies[i]) m = candies[i];
        }
        return m;
    }
}
