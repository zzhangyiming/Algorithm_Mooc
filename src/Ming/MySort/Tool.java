package Ming.MySort;

public class Tool {

    public static void printf(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] CreatArray(int left,int right,int count){
        int[] arr = new int[count];
        for(int i = 0 ;i<count;i++){
            arr[i] = (int)(Math.random()*(right-left+1)+left);
        }
        return arr;
    }

    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}
