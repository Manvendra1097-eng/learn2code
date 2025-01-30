package com.manvendra.arrays;

// https://www.geeksforgeeks.org/problems/second-largest3735/1
public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getSecondLargest(arr));
    }

    static int getSecondLargest(int[] arr) {
        int max = -1;
        int sMax = -1;
        for (int n : arr) {
            if (n > max) {
                sMax = max;
                max = n;
            } else if (n < max && n > sMax) {
                sMax = n;
            }
        }
        return sMax;
    }
}
