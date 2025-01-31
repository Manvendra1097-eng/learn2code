package com.manvendra.arrays;

// https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {-2, 2, -5, 2 ,-2 ,7 ,1 ,-8};
//        int[] arr = {-8, 0, -1, -4, -3};
        System.out.println(smallestPositiveMissingNumber(arr));
    }

    private static int smallestPositiveMissingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int correct = arr[i] - 1;
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {
                // then swap arr[i] and arr[arr[i]-1] to
                // place arr[i] to its corresponding index
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }

        // If any number is not at its corresponding index
        // then it is the missing number
        for (int i = 1; i <= n; i++) {
            if (i != arr[i - 1]) {
                return i;
            }
        }
        return n + 1;
    }
}
