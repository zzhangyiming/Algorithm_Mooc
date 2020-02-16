package LeetCode;

import Ming.MySort.Tool;

public class No80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2 ) return nums.length;
        int k = 2;
        for(int i =2 ;i <nums.length ; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3};
       int a =  (new No80()).removeDuplicates(arr);
        Tool.printf(arr);
        System.out.println("result="+a);
    }
}
