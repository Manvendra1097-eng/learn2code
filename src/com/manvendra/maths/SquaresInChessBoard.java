package com.manvendra.maths;

// https://www.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1
public class SquaresInChessBoard {
    public static void main(String[] args) {
        int num = 4;
        int ans = squaresInChessBoardRec(num);
        System.out.println(ans);
        ans = squaresInChessBoard(num);
        System.out.println(ans);
    }

    private static int squaresInChessBoard(int num) {
        return num == 1 ? num : num * (num + 1) * (2 * num + 1) / 6;
    }

    private static int squaresInChessBoardRec(int num) {
        return num == 1 ? num : num * num + squaresInChessBoard(num - 1);
    }
}
