package com.manvendra.maths;

// https://www.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1
public class ZerosInFactorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = trailingZeroes(n);
        System.out.println(ans);
    }

    static int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
