package com.techlabs.TicTokToe;

public class Cell {
	private MarkType mark;
    // Constructor
    public Cell() {
        mark = MarkType.EMPTY;
    }
    // Check if the cell is empty
    public boolean isEmpty() {
        return mark == MarkType.EMPTY;
    }
    public MarkType getMark() {
        return mark;
    }
    public void setMark(MarkType mark) throws CellAlreadyMarkedException {
        if (!isEmpty()) {
            throw new CellAlreadyMarkedException("Cell is already marked.");
        }
        this.mark = mark;
    }

}
