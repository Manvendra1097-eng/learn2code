package com.manvendra.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/problems/count-number-of-elements-between-two-given-elements-in-array4044/1
public class NoOfElmBtw2Elm {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(4, 2,4, 1, 10, 6,6));
        int num1 = 4, num2 = 4;
        int ans = getCount(arr,  num1,  num2);
        System.out.println(ans);
    }

    static int getCount(ArrayList<Integer> arr,int num1,int num2){
        int cnt1 = -1 , cnt2 = -1;
        boolean flag = true;

        for(int i=0;i < arr.size() ; i++){
            if(arr.get(i) == num1 && cnt1 == -1 && flag){
                cnt1 = i;
                flag = false;
            }

            if (arr.get(i) == num2 && flag){
                cnt2 = i;
            }
            flag = true;
        }
        return cnt2 > cnt1 ? cnt2 - cnt1 - 1 : 0;
    }
}
