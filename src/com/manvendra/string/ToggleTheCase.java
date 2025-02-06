package com.manvendra.string;

public class ToggleTheCase {
    public static void main(String[] args) {
        String str = "AbCsdHk";
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            boolean lowerCase = Character.isLowerCase(ch);
            if(lowerCase)
                sb.append((char)(ch - 32));
            else
                sb.append((char)(ch + 32));
        }
        System.out.printf(sb.toString());
    }
}
