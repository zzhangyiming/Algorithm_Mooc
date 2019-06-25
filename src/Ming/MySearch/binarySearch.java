package Ming.MySearch;

public class binarySearch {
    public binarySearch(){}

    public static int  find(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                r = mid - 1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }

}
