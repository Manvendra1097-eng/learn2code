package com.manvendra.binarysearch;

// https://www.geeksforgeeks.org/problems/count-the-zeros2550/1
public class CountZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0};
        System.out.println(new CountZeroes().countZeroes(arr));
    }

    int countZeroes(int[] arr) {
        // find zero first occurrence
        // find zero last occurrence
        // return last - first + 1
        int first = searchZero(arr, true);
        if (first == -1)
            return 0;
        int last = searchZero(arr, false);
        return last - first + 1;
    }

    int searchZero(int[] arr, boolean isFirst) {
        int s = 0, e = arr.length - 1, index = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == 0) {
                index = m;
                if (isFirst)
                    e = m - 1;
                else
                    s = m + 1;
            } else {
                s = m + 1;
            }
        }
        return index;
    }
}
