package com.manvendra.binarysearch;

public class FindPeakElem {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(new FindPeakElem().findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0, e = n - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            int prev = m == 0 ? nums[m] - 1 : nums[m - 1];
            int next = m == n - 1 ? nums[m] - 1 : nums[m + 1];
            int target = nums[m];
            if (target > prev && target > next)
                return m;
            if (target < next) {
                s = m + 1;
            } else if (target < prev) {
                e = m - 1;
            }
        }
        return s;
    }
}