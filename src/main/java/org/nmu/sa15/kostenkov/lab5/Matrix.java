package org.nmu.sa15.kostenkov.lab5;

import java.util.List;

public class Matrix {
    private int row;
    private int column;
    public List<List<Integer>> list;
    private String author="Kostenkov";

    public Matrix() {
    }

    public void setList(List<List<Integer>> list) {
        this.list = list;
    }

    public List<List<Integer>> getList() {
        return list;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
