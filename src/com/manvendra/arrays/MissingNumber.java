package com.manvendra.arrays;

// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i - arr[i];
        }
        return sum + n + n + 1;
    }
}
