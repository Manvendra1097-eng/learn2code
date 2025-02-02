package com.manvendra.binarysearch;

// https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        if (x < 2) return x;
        int start = 0, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) return mid;
            else if (mid > x / mid) end = mid - 1;
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
