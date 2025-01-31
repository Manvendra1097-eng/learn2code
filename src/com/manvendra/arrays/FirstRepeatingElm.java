package com.manvendra.arrays;

import java.util.HashSet;

// https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
public class FirstRepeatingElm {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int ans = firstRepeated(arr);
        System.out.println(ans);
    }

    private static int firstRepeated(int[] arr) {
        HashSet<Integer> s = new HashSet<>();

        // If an element is already present, return it
        // else insert it
        int minEle = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.contains(arr[i])) {
                minEle = Math.min(minEle, i);
            }
            s.add(arr[i]);
        }

        // If no element repeats
        return minEle == Integer.MAX_VALUE ? -1 : minEle;
    }
}
