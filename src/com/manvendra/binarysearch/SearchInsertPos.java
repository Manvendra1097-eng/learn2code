package com.manvendra.binarysearch;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }

    static int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = nums.length;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                ans = m;
                break;
            } else if (nums[m] > target) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}
