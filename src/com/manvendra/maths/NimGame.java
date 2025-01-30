package com.manvendra.maths;

// https://leetcode.com/problems/nim-game/
public class NimGame {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(canWinNim(n));
    }

    public static boolean canWinNim(int n) {
        return n % 4 == 0 ? false : true;
    }
}
