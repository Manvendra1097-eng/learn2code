package com.manvendra.binarysearch;

// https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(new KthMissingNumber().findKthPositive(arr, k));
    }

    public int findKthPositive(int[] arr, int k) {
        // 2 3 4 7 11 --> k = 5
        // 1 1 1 3 6
        // (2-1) (3-2) (4-3) (7-4) (11-5)
        // arr[0] - (0 + 1)
        int s = 0, e = arr.length - 1;
        int index = arr.length;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] - m - 1 >= k) {
                index = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        // int noOfMiss = (arr[index] - index - 1);
        // int addK = arr[index] - index - 1 -k + 1;
        // return arr[index] - addk;
        // return arr[index] - arr[index] + index + 1 + k - 1;
        return k + index;
    }
}
