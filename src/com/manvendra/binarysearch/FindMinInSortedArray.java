package com.manvendra.binarysearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(new FindMinInSortedArray().findMin(arr));
    }

    public int findMin(int[] arr) {
        // either of the half always sorted
        // 1st half sorted -> check in second half
        // 2nd half sorted -> current index may be answered, save it -> check first half
        int s = 0, e = arr.length - 1, res = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] >= arr[0]) {
                // first half sorted
                s = m + 1;
            } else {
                // second half sorted
                res = m;
                e = m - 1;
            }
        }
        return arr[res];
    }
}
