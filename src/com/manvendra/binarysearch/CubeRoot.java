package com.manvendra.binarysearch;

// https://www.geeksforgeeks.org/problems/cube-root-of-a-number0915/1
public class CubeRoot {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(cubeRoot(x));
    }

    static int cubeRoot(int x) {
        // 2147483647

        if (x < 2) return x;
        if (x < 7) return 1;

        int start = 0, end = x / 2, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x / mid) return mid;
            else if (mid * mid > x / mid) end = mid - 1;
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;

    }
}
