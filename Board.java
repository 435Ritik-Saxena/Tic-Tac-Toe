package com.techlabs.TicTokToe;

public class Board {
	private Cell[][] cells;
    public Board() {
        cells = new Cell[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) 
                cells[row][col] = new Cell();
        }
    }
    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (cells[row][col].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
    public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
        int row = loc / 3;
        int col = loc % 3;
        cells[row][col].setMark(mark);
    }

}
