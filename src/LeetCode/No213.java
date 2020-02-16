package LeetCode;

public class No213 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int len = nums.length;
        // 拿第一个不拿最后一个
        int[] dp1 = new int[len];
        dp1[0] = nums[0];
        dp1[1] = Math.max(dp1[0],dp1[1]);
        // 不拿第一个拿最后一个
        int[] dp2 = new int[len];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i]);
            dp2[i] = Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println((new No213()).rob(arr));
    }
}
