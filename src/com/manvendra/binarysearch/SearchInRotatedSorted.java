package com.manvendra.binarysearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(new SearchInRotatedSorted().search(arr, target));
    }

    public int search(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target)
                return m;

            // Left half is sorted
            if (arr[s] <= arr[m]) {
                if (arr[s] <= target && target < arr[m]) {
                    e = m - 1; // Target is in left half
                } else {
                    s = m + 1; // Target is in right half
                }
            }
            // Right half is sorted
            else {
                if (arr[m] < target && target <= arr[e]) {
                    s = m + 1; // Target is in right half
                } else {
                    e = m - 1; // Target is in left half
                }
            }
        }
        return -1;
    }
}
