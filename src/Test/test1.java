package Test;

import Ming.MySort.Tool;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {6, 4, 7, 3, 2, 1, 9, 8, 5};
        (new test1()).quicksort(arr);
        Tool.printf(arr);
    }

    public void sort(int[] arr, int l, int r) {
        if( l >= r )
            return;
        swap(arr, l, (int) Math.random() * (r - l + 1) + l);  //随机交换V 与 l 索引的位置
        int v = arr[l];
        int lt = l;
        int gt = r + 1;
        int i = l + 1;
        while (i < gt) {
            if (arr[i] < v) {
                swap(arr, i, lt + 1);
                lt++;
                i++;
            } else if (arr[i] > v) {
                swap(arr, i, gt - 1);
                gt--;
            } else {
                i++;
            }
        }
        swap(arr, l, lt);
        sort(arr, l, lt - 1);
        sort(arr, gt, r);
    }

    public void quicksort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}