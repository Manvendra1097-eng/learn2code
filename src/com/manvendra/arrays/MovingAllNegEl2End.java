package com.manvendra.arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
public class MovingAllNegEl2End {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregateElements(int[] arr) {
        int n = arr.length;
        int nevElCnt = 0;
        for (int num : arr) {
            if (num <= 0)
                nevElCnt++;
        }
        int[] ans = new int[n];

        int i = 0;
        int j = n - nevElCnt;

        for (int k = 0; k < n; k++) {
            if (arr[k] >= 0)
                ans[i++] = arr[k];
            else
                ans[j++] = arr[k];
        }
        for (int l = 0; l < n; l++) {
            arr[l] = ans[l];
        }
    }
}
