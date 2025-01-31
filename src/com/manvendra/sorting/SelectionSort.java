package com.manvendra.sorting;

import java.util.Arrays;

/* ------------------
   Cases | Time complexity
   Best  | n^2
   Worst | n^2
   Avg   | n^2
   -----------
   Not a stable algorithm
 ---------------------------- */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,9,0,2,2,11,1,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        // select max from [0,n-1] place at last
        // select max from [0,n-2] place at n-2
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = 0;
            for (int j = 0; j < n - i; j++) {
                max = arr[j] > arr[max] ? j : max;
            }
            int temp = arr[max];
            arr[max] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
