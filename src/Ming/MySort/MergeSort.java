package Ming.MySort;

import java.util.Arrays;

public class MergeSort {
    private static void Merge(int []arr, int l,int mid,int r){
        int i = l;
        int j = mid+1;
        int[] temp = Arrays.copyOfRange(arr,l,r+1);
        for(int k = l;k<=r;k++){
            if(i>mid){//左边完成遍历
                arr[k] = temp[j-l];
                j++;
            }else if(j>r){//右边完成遍历
                arr[k] = temp[i-l];
                i++;
            }else if(temp[i-l] < temp[j-l]){//左半边元素<右半边元素
                arr[k] = temp[i-l];
                i++;
            }else{//左半边元素>右半边元素
                arr[k] = temp[j-l];
                j++;
            }
        }
    }

    private static void sort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        Merge(arr, l, mid, r);
    }

    public static void sort(int[] arr){
        int n = arr.length;
        sort(arr,0,n-1);
    }

    public static void main(String[] args){
        int[] arr = Tool.CreatArray(0,100,10);
        sort(arr);
        Tool.printf(arr);
    }
}
