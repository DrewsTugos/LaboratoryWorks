package org.nmu.sa15.kostenkov.lab2;

public class Matrix {
    private int row ;
    private int column ;
    int[][] matrixBody ;

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

    public int[][] getMatrixBody() {
        return matrixBody;
    }

    public void setMatrixBody(int[][] matrixBody) {
        this.matrixBody = matrixBody;
    }
}
