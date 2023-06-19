package com.techlabs.TicTokToe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
        System.out.println("Is board full? " + board.isBoardFull());
        try {
            board.setCellMark(0, MarkType.X);
            board.setCellMark(1, MarkType.O);
            board.setCellMark(2, MarkType.X);
            // Trying to mark an already marked cell
            board.setCellMark(2, MarkType.X);
            board.setCellMark(7, MarkType.X);
            board.setCellMark(8, MarkType.X);
        } catch (CellAlreadyMarkedException e) {
            System.out.println(e.getMessage());
        }
        // Testing isBoardFull method again
        System.out.println("Is board full? " + board.isBoardFull());

	}

}
