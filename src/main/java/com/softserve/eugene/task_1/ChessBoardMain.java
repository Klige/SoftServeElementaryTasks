package com.softserve.eugene.task_1;

public class ChessBoardMain {
    public static void main(String[] args) {
        ChessBoardScanner scanner = new ChessBoardScanner();
        int width = scanner.parseInt("Width");
        int height = scanner.parseInt("Height");
        showBoard(width, height);
    }

    private static void showBoard(int width, int height) {
        ChessBoard chessBoard = new ChessBoard(width, height);
        System.out.println(chessBoard.getCurrentChessBoard());
    }
}
