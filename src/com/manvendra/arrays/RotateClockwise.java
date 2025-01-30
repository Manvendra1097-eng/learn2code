package com.manvendra.arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class RotateClockwise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Before : " + Arrays.toString(arr));
        rotate(arr);
        System.out.println("After :  " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr) {
        int n = arr.length - 1;
        int lElem = arr[n];
        for (int i = n; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lElem;
    }
}
