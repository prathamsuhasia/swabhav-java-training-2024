package com.aurionpro.model;

import com.aurionpro.exceptions.CellAlreadyMarkedException;

public class Cell {
    private MarkType mark;

    public Cell() {
        this.mark = MarkType.EMPTY;
    }

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark) {
        if (this.mark != MarkType.EMPTY) {
            throw new CellAlreadyMarkedException(this.mark);
        }
        this.mark = mark;
    }
}
