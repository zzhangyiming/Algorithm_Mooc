package Ming.MySort;

public class InsertionSort {

    public static void  sort(int[] arr){
        int n  =arr.length;
        for(int i=1;i<n;i++){
            for(int j = i;j>0&&arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void printf(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,5,1,8,4,7,1,9,6};
        sort(arr);
        printf(arr);
    }

}
