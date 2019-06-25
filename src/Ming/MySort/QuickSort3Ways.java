package Ming.MySort;

public class QuickSort3Ways {
    public static void sort(int[] arr, int l,int r){
        if(l>=r){
            return;
        }
        Tool.swap(arr,l,(int)(Math.random()*(r-l+1)+l));
        int v = arr[l];
        int i = l+1;
        int lt = l;
        int gt = r+1;
        while(i<gt){
            if(arr[i]<v){
                Tool.swap(arr,i,lt+1);
                i++;
                lt++;
            }else if(arr[i]>v){
                Tool.swap(arr,i,gt-1);
                gt--;
            }else{
                i++;
            }
        }
        Tool.swap(arr,l,lt);
        sort(arr,l,lt-1);
        sort(arr,gt,r);
    }
    public static void sort(int[] arr){
        int n = arr.length-1;
        sort(arr,0,n);
    }
    public static void main(String[] args){
        int[] arr = Tool.CreatArray(0,100,20);
        sort(arr);
        Tool.printf(arr);
    }
}
