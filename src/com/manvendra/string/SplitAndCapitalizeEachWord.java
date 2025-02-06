package com.manvendra.string;

public class SplitAndCapitalizeEachWord {
    public static void main(String[] args) {
        String str = "Hello How are  you";
        String[] strArr = str.split(" ");
        for (String st : strArr) {
            String fStr = st.isBlank() ? "" : st.charAt(0) + "";
            st = st.replaceFirst(fStr, fStr.toUpperCase());
            System.out.println(st);
        }
    }
}
