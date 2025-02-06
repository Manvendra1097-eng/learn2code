package com.manvendra.string;

public class LearnStringBuilder {
    public static void main(String[] args) {
//      StringBuilder sb = new StringBuilder(); ==> initial capacity is 16
//      StringBuilder sb = new StringBuilder("abc"); ==> initial capacity is 16 + "abc".length() = 19
        StringBuilder sb = new StringBuilder("abc");

//      replace b - with z
        sb.setCharAt(1, 'z');
        System.out.println("1: " + sb);

//      insert A at start
        sb.insert(0,'A');
        System.out.println("2: "+sb);

//      remove a from string
        sb.delete(1,2);
//   or sb.deleteCharAt(1);
        System.out.println("3: "+sb);

//      replace "Az" with "XY"
        sb.replace(0,2,"XY");
        System.out.println("4: "+sb);
    }
}
