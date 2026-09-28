package Arrays1;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));

    }
        public static int removeElement(int[] nums, int val) {
            int[] ans = new int[nums.length];
            int j = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != val) {
                    ans[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
}
