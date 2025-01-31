package com.manvendra.sorting;

import java.util.Arrays;

/* ------------------
   Cases | Time complexity
   Best  | n
   Worst | n^2
   Avg   | n^2
   -----------
   A stable algorithm
 ---------------------------- */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 9, 0, 2, 2, 11, 1, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n ; i++) {
            int j = i;
            int temp = arr[j];
            while (j > 0 && temp < arr[j -1 ]){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
