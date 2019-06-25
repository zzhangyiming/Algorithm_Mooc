package Test;

public class t1 {

    public static int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}


