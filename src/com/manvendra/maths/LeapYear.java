package com.manvendra.maths;

// https://www.geeksforgeeks.org/problems/leap-year0943/1
public class LeapYear {
    public static void main(String[] args) {
        int year = 200;
        boolean isLeapYear = isLeapYear(year);
        System.out.printf("%d is leap year? %b", year, isLeapYear);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
