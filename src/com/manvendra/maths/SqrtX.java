package com.manvendra.maths;

// https://leetcode.com/problems/sqrtx/
public class SqrtX {
    public static void main(String[] args) {
        int num = 64;
        int sqrt = sqrt(num);
        System.out.printf("Sqrt root of %d is %d", num, sqrt);
    }

    static int sqrt(int x) {
        int ans = 0;
        if (x == 0) return ans;
        int i = 1;
        for (; i <= x / i; i++) {
            if (i * i <= x)
                ans = i;
        }
        return ans;
    }
}
