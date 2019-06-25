package Ming.SORT;

import Ming.MySort.Tool;

public class selectionsort1 {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minindex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                   minindex = j;
                }
            }
            swap(arr,minindex,i);
        }
    }
     private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
     }

     public static void main(String[] args){
         int[] arr1 = Tool.CreatArray(1,100,20);
         sort(arr1);
         Tool.printf(arr1);
     }
}
