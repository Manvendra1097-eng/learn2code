package com.manvendra.binarysearch;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(new PeakIndexInMountainArray().peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) { // No need for `<=` as we are searching for a single index
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Mid is on the increasing slope, move right
                s = mid + 1;
            } else {
                // Mid is on the decreasing slope or at peak, move left
                e = mid;
            }
        }
        return s; // or e (both will be the peak index)
    }
}
