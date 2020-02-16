package LeetCode;

import Ming.MySort.Tool;

public class No283 {

        public void moveZeroes(int[] nums) {
            int k = 0;
            for(int i = 0;i < nums.length ;i++){
                if(nums[i] != 0){
                    if(i!=k) {
                        swap(nums, k, i);k++;
                    } else {
                        k++;
                    }
                }
            }

        }
        public void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    public static void main(String[] args) {
        int[] arr = {1,8,0,3,45,0,2};
        (new No283()).moveZeroes(arr);

        Tool.printf(arr);
    }

}
