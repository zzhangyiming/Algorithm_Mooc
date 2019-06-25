package Test;

import Ming.MySort.Tool;
public class FullyArranged {
    public static void perm(int k,int[] arr){
        if(k>=arr.length){
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+"  ");
            System.out.println();
            return;
        }
        for(int i=k;i<arr.length;i++){
            Tool.swap(arr,i,k);
            perm(k+1,arr);
            Tool.swap(arr,i,k);
        }
}
    public static void main(String[] args){

       int[] arr1 ={1,2,3};
        perm(0,arr1);
    }
}
