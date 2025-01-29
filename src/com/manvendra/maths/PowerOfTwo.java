package com.manvendra.maths;

// https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 64;
        boolean isPowerOf2 = powerOfTwo(num);
        System.out.printf("%d is power of 2 ? %b",num,isPowerOf2);
    }

    private static boolean powerOfTwo(int num) {
        return num != 0 && num != Integer.MIN_VALUE && (num & num -1) == 0;
    }
}
