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

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 9, 0, 2, 2, 11, 1, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap)
                break;
        }
    }
}
