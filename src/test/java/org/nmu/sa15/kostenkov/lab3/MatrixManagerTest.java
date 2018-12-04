package org.nmu.sa15.kostenkov.lab3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest {
    private final static int ROW = 2;
    private final static int COLUMN = 2;
    private final static int MAX_POSSIBLE_MATRIX_VALUE = 4;
    private final static int MIN_POSSIBLE_MATRIX_VALUE = 1;
    private static Matrix matrix = new Matrix();
    private static MatrixManager matrixManager = new MatrixManager();


    @Before
    public void createBaseMatrix() {
        matrix.setRow(ROW);
        matrix.setColumn(COLUMN);
    }

    @Test
    public void calculateMatrixSumOfElements() {
        int[][] matrixData = {{1, 2}, {4, 5}};
        matrix.setMatrixBody(matrixData);
        int summa = matrixManager.calculateMatrixSumOfElements(matrix);
        assertEquals("Sum of elements must be 12", 12, summa);
    }


    @Test
    public void findMatrixMinimum() {
        int[][] matrixData = new int[ROW][COLUMN];
        int currentElementValue = MIN_POSSIBLE_MATRIX_VALUE;
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                matrixData[i][j] = currentElementValue;
                currentElementValue++;
            }
        }
        matrix.setMatrixBody(matrixData);
        assertEquals(MIN_POSSIBLE_MATRIX_VALUE, matrixManager.findMatrixMinimum(matrix));
    }

    @Test
    public void findMatrixMaximum() {
        int[][] matrixData = new int[ROW][COLUMN];
        int currentElementValue = MAX_POSSIBLE_MATRIX_VALUE;
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                matrixData[i][j] = currentElementValue;
                currentElementValue--;
            }
        }
        matrix.setMatrixBody(matrixData);
        int maxElement = matrixManager.findMatrixMaximum(matrix);
        assertTrue(MAX_POSSIBLE_MATRIX_VALUE == maxElement);
    }
}