package com.manvendra.string;

/*===============================

 - String is combination of characters
 - String instances are immutable, if you try to change new instance will be created in memory
 - If you change the value new object is created and heap with is now referred by reference variable available in stack
 -

 ================================*/
public class LearnString {
    public static void main(String[] args) {
        /*
            s1 and s2 are defined using string literals - in that case for object of "abc" is generated inside
            SCP (String constant pool) :  this is special memory space inside heap.
            In that case s1 and s2 pointing to same object in SCP that's the reason String are immutable otherwise any
            reference variable can change the value of any different reference variable value.

            Case of s3 and s4 as we have used new key word it is not created in SCP and for both we have new object.
         */
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false
        System.out.println(s1 == s3); // false

        /* =============================== */
        String str = "xyz";
        String sStr = "xaz";
        // char c = str.charAt(0);
        // char[] charArray = str.toCharArray();
        // String upperCase = str.toUpperCase();
        int res = str.compareTo(sStr);
        System.out.println(res); // +ve
        res = sStr.compareTo(str);
        System.out.println(res); // -ve
        // if length is not matching of both string it matches the length like below
        String a1 = "qw";
        String a2 = "qwrt";
        System.out.println("Should return -2 : and returned "+a1.compareTo(a2));
        System.out.println("Should return  2 : and returned "+a2.compareTo(a1));

        boolean strW = a1.startsWith("q");
        System.out.println("Started with q : "+strW);
        // similarly we have endsWith
        String a3 = "qwertyqwerty";
        int indxOfFirstOccurence = a3.indexOf("q");
        System.out.println("First index of 'q' : "+indxOfFirstOccurence);
        String a4 = "   ";
        // it returns true id string is empty or conataining whitespaces
        boolean blank = a4.isBlank();
        // it returns true only if length is zero
        boolean empty = a4.isEmpty();
        System.out.println( "is Blank should return true: "+blank);
        System.out.println("is Empty should return false : "+empty);
        String substring = a3.substring(2);
        System.out.println(substring);
        substring = a3.substring(2,6);
        System.out.println(substring);
    }
}
