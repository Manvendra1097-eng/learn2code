package com.manvendra.binarysearch;

// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
public class NumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.printf("Number of occurrence of %d is %d",target,countFreq(arr,target));
    }

   static int countFreq(int[] arr, int target) {

        int n = arr.length;

        // find first occurrence
        int s = 0,e = n - 1,ans1 = -1,ans2=-1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(arr[mid] == target){
                ans1 = mid;
                // move left
                e = mid -1;
            }
            else if (arr[mid] > target){
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        if(ans1 == -1)
            return 0;

        s = 0;
        e = n - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(arr[mid] == target){
                ans2 = mid;
                // move right
                s = mid + 1;
            }
            else if (arr[mid] > target){
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        return ans2 - ans1 + 1;

    }
}
