package com.manvendra.maths;

// https://leetcode.com/problems/add-digits/
public class AddDigits {
    public static void main(String[] args) {
        int num = 707;
        int ans = addDigits(num);
        System.out.printf("Sum digits of %d is %d",num,ans);
    }

    private static int addDigits(int num) {
        return num != 0 ? (num % 9 == 0 ? 9 : num % 9) : num;
    }
}
