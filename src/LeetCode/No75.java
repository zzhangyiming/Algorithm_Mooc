package LeetCode;

import Ming.MySort.Tool;

public class No75 {
    public void sortColors(int[] nums) {
//        int[] count  = new int[3];
//        for (int num : nums) {
//            assert (num >= 0 && num <=2 );
//            count[num]++;
//        }
        int zero = -1;  //nums[0.....zero] == 0
        int two = nums.length;  //  nums[two....n-1] == 2
        for(int i = 0; i < two ; ){
            if(nums[i] == 1){
                i++;
            }else if( nums[i] == 2){
                two--;
                Tool.swap(nums,i,two);
            }else{
                assert(nums[i] == 0);
                zero++;
                Tool.swap(nums,zero,i);
                i++;
            }
        }
    }
}
