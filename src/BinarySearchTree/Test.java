package BinarySearchTree;

import Ming.MySort.Tool;

public class Test {
    public static void main(String[] args){
        int[] arr = Tool.CreatArray(0,100,20);
        for(int i = 0;i<arr.length;i++){
            for(int j =i;j>0 && arr[j-1]>arr[j];j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        Tool.printf(arr);
    }
}
