package com.manvendra.maths;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 401113;
        int reverse = reverse(x);
        System.out.printf("Reverse integer of %d is %d",x,reverse);
    }
    public static int reverse(int x) {
        int num = 0;
        while(x != 0){
            int rem = x % 10;
            x /= 10;
            if(num > Integer.MAX_VALUE / 10 || num < Integer.MIN_VALUE / 10)
                return 0 ;
            num = num * 10 + rem;
        }
        return num;
    }
}
