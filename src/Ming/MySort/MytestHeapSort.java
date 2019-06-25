package Ming.MySort;

import java.util.Arrays;

public class MytestHeapSort {
    public void sort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n+1];
        for(int i=0;i<n;i++)
            temp[i+1] = arr[i];
        temp = MaxHeap(temp);
        for(int i = arr.length-1;i>=0;i--){
            arr[i] = temp[1];
            swap(temp,1,n);
            n--;
            shiftDown(1,n,temp);
        }
    }

    private int[] MaxHeap(int[] arr){
        int n = arr.length;
        for(int i = n/2; i >= 1;i--)
            shiftDown(i,n-1,arr);
        return arr;
    }

    private void shiftDown(int k,int z,int[] arr){
        while(2*k <= z){
            int j = 2*k;
            if(j+1<=z && arr[j]<arr[j+1])
                j++;
            if(arr[k]>=arr[j])
                break;
            swap(arr,j,k);
            k = j;
        }
    }

    private void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] =  arr[j];
        arr[j] = t;
    }
    public static void main(String[] args){
        int[] arr = Tool.CreatArray(1,100,10);
        Tool.printf(arr);
        MytestHeapSort m = new MytestHeapSort();
        m.sort(arr);
        Tool.printf(arr);
    }
}
