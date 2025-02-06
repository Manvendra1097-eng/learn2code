package com.manvendra.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    ISR - InputStreamReader : it read character by character
    combine it with Buffered Reader for bulk data
 */
public class LearnBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("Sum of "+num1 +" and "+num2+" = "+ (num2+num1));
    }
}
