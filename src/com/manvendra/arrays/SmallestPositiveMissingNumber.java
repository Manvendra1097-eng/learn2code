package com.manvendra.arrays;

// https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {-8, 0, -1, -4, -3};
        System.out.println(smallestPositiveMissingNumber(arr));
    }

    private static int smallestPositiveMissingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
