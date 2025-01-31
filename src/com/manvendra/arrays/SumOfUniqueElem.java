package com.manvendra.arrays;

// https://leetcode.com/problems/sum-of-unique-elements/
public class SumOfUniqueElem {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int ans = sumOfUniqueElem(nums);
        System.out.println(ans);
    }

    private static int sumOfUniqueElem(int[] nums) {
        int[] ans = new int[101];
        int sum = 0;
        for(int num : nums){
            ans[num]++;
        }
        for(int i=0;i < 101 ;i++){
            if(ans[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}
