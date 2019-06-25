package Test;

import Ming.MySort.Tool;

import java.util.Arrays;

public class MaxHeapSort {
    private void sort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n+1];
        for(int i = 0;i<n;i++){
            temp[i+1] = arr[i];
        }
        MaxHeap(temp);
        for(int i = arr.length-1; 0 <= i; i--){
            arr[i] = temp[1];
            swap(temp,1,n);
            n--;
            shiftDown(temp,1,n);
        }
    }
    private void shiftDown(int[]temp,int k,int z){
        while(2*k<=z){
            int j =2*k;
            if(j+1<=z && temp[j]<temp[j+1]){
                j++;
            }
            if(temp[k]>=temp[j]){
                break;
            }
            swap(temp,j,k);
            k = j;
        }
    }
    private void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    private void MaxHeap(int[] temp){
        int n = temp.length;
        for(int i = n/2;i>=1;i--){
            shiftDown(temp,i,n-1);
        }
    }

    public static void main(String[] args){
        MaxHeapSort m = new MaxHeapSort();
        int[] arrs = Tool.CreatArray(0,990,10);
        m.sort(arrs);
        Tool.printf(arrs);
    }
}
