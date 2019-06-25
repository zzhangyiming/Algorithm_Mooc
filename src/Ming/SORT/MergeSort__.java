package Ming.SORT;

import java.util.Arrays;

public class MergeSort__ {
	public static void merge_(Comparable[] arr,int l,int mid,int r) {
		int i = l;
	    int j = mid+1;
	    int t=0;
	    Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);
	    while(i<=mid&&j<=r)
	    {
	        if(arr[i].compareTo(arr[j])<0)
	        {
	        	aux[t++]=arr[i++];
	        }else{
	        	aux[t++]=arr[j++];
	        }
	    }
	    while(i<=mid)
	    {
	    	aux[t++] = arr[i++];
	    }
	    while(j<=r)
	    {
	    	aux[t++] = arr[j++];
	    }
	    t=0;
	    while(l<=r)
	    {
	        arr[l++] = aux[t++];
	    }
		
	}
	public static void sort(Comparable[] arr, int l, int r) {
        if (l >= r)
            return;
        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge_(arr, l, mid, r);
    }
    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    public static void main(String[] args){
		Integer[] arr = SortTestHelper.generateRandomArray(10,0,100);
		sort(arr);
		SortTestHelper.printArray(arr);
	}
}
