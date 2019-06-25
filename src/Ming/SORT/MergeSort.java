package Ming.SORT;

import java.util.Arrays;

public class MergeSort {
	public static void merge(Comparable[] arr,int l,int mid,int r) {
		Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);
		
		 // 初始化，  
        int i = l, j = mid+1;
           for( int k = l ; k <= r; k ++ ){

            if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j-l]; j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i-l]; i ++;
            }
            else if( aux[i-l].compareTo(aux[j-l]) < 0 ){  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i-l]; i ++;
            }
            else{  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j-l]; j ++;
            }
        }
		
	}
	
	
	
	   // 递归使用归并排序,对arr[l...r]的范围进行排序
    public static void sort(Comparable[] arr, int l, int r) {
    	
        if (l >= r)
            return;
        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
      
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
