package Ming.MySort;

public class QuickSort {
    public static int partition(int[]arr,int l,int r){
        int v = arr[l];
        int j=l;
        for(int i = l+1;i<=r;i++){
            if(arr[i] < v){
                Tool.swap(arr,i,j+1);
                j++;
            }
        }
        Tool.swap(arr,l,j);
        return j;
    }

    public static void sort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int p = partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        sort(arr,0, n-1);
    }

    public static void main(String[] args){
        int[] arr = Tool.CreatArray(0,100,20);
        sort(arr);
        Tool.printf(arr);
    }




}
