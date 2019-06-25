package Ming.SORT;

import java.util.Arrays;

public class InsertionSort {
	

    private InsertionSort(){}
    
	public static void sort(Comparable arr[]) {
		int n = arr.length;
//		 for (int i = 0; i < n; i++) {
//			for( int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0 ; j--)
//	            swap(arr, j, j-1);
//
//		 }
		 int j=0;
		 for(int i =1;i<n;i++) {
			 int key = (int)arr[i];
			 j =i-1;
			 while(j>=0 && arr[j].compareTo(key)>0 ) {
				 arr[j+1] = arr[j]; 
				 j--;
			 }
			 arr[j+1] =key;
		 }
	}
	
	 private static void swap(Object[] arr, int i, int j) {
	        Object t = arr[i];
	        arr[i] = arr[j];
	        arr[j] = t;
	    }
	 
	 public static void main(String[] args) {
		int n = 100000;
		 Integer[] arr1 =SortTestHelper.generateNearlyOrderedArray(n, 50);
		 Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
		 SortTestHelper.TestSort("SelectionSort",arr1);
		 SortTestHelper.TestSort("InsertionSort",arr2);
//		 InsertionSort.sort(arr1);
//		 SortTestHelper.printArray(arr1);
	}
}
