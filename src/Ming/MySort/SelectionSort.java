package Ming.MySort;

public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minindex = i;
            for(int j = i+1;j < n;j++){
                if(arr[minindex]>arr[j]){
                    minindex = j;
                }
            }
            Tool.swap(arr,i,minindex);
        }
    }
    public static void main(String[] args){
        int[] arr = Tool.CreatArray(0,100,20);
        sort(arr);
        Tool.printf(arr);
    }
}
