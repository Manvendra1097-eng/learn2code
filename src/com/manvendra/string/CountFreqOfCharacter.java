package com.manvendra.string;

public class CountFreqOfCharacter {
    public static void main(String[] args) {
        String str = "hello how".replace(" ","").toLowerCase();
        int[] charArr = new int[26];
        // a -> 97 -> index = ch - 97 = 0
        for (char ch : str.toCharArray()){
            charArr[ch - 97]++;
        }
        for (int i= 0 ;i < 26; i++){
            int count = charArr[i];
            if(count != 0)
                System.out.println((char)('a'+i) +" : "+count);
        }
    }
}
