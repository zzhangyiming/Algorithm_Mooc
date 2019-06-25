package Ming.MySort;

public class QuickSort2Ways {
    public static int partition(int[] arr,int l,int r){
        Tool.swap(arr,l,(int)(Math.random()*(r-l+1)+l));
        int v = arr[l];
        int i = l+1;
        int j = r;
        while(true){
            while(i <= r && arr[i]<v){
                i++;
            }
            while(j >= l+1 && arr[j]>v){
                j--;
            }
            if(i>j)
                break;
            Tool.swap(arr,i,j);
            i++;
            j--;
        }
      Tool.swap(arr,l,j);
        return j;
    }

    public static void sort(int[] arr,int l,int r){
        if(l>=r)
            return;
        int p = partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
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
