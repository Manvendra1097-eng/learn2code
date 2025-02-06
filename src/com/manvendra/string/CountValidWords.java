package com.manvendra.string;

public class CountValidWords {
    public static void main(String[] args) {
        String[] strArr = {"attention", "practice", "attend", "pay"};
        String pref = "at";
        int count = 0;
        for (String str : strArr) {
            if(startsWith(pref,str))
                count++;
        }
        System.out.printf("count : %d",count);
    }

    static boolean startsWith(String pref , String word){
        if(pref.length() > word.length()) return false;
        for (int i=0;i<pref.length();i++){
            if(pref.charAt(i) != word.charAt(i))
                return false;
        }
        return true;
    }
}
