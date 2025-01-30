package com.manvendra.maths;

// https://leetcode.com/problems/ugly-number/
public class UglyNumber {
    public static void main(String[] args) {
        int num = 6;
        boolean isUgly = isUgly(num);
        System.out.printf("%d is ugly number ? %b", num, isUgly);
    }

    private static boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }
}
