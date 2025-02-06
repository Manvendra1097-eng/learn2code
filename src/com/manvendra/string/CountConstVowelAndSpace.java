package com.manvendra.string;

public class CountConstVowelAndSpace {
    public static void main(String[] args) {
        String str = "QASBKDasqw  xehla";

        str = str.toLowerCase();
        int c=0, v=0 , w=0 ;
        for (char ch : str.toCharArray()){
            switch (ch){
                case ' ' -> w++;
                case 'a','e','i','o','u' -> v++;
                default -> c++;
            }
        }
        System.out.printf("constant = %d, vowel = %d, whitespaces = %d",c,v,w);
    }
}
