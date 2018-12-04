package org.nmu.sa15.kostenkov.lab5;

import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        final String FILEPATH = "D://ftww.json";
        final String FILEPATH_2 = "D://ftww2.json";
        MatrixManager matrixManager = new MatrixManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of row: ");
        int numberOfRow = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of column: ");
        int numberOfColumn = Integer.parseInt(reader.readLine());
        //System.out.println("Enter matrix elements:");
        Matrix matrix = matrixManager.createMatrix(numberOfRow, numberOfColumn);
        matrixManager.displayMatrix(matrix);
        System.out.println("sum is " + matrixManager.calculateMatrixSumOfElements(matrix) +
                ", min element is " + matrixManager.findMatrixMinimum(matrix) +
                ", max element is " + matrixManager.findMatrixMaximum(matrix));
        MatrixWriteRead matrixInOut = new MatrixWriteRead();
        //matrixInOut.writeToFile(matrix, FILEPATH);
        matrixInOut.readFromFile(matrix,FILEPATH);
        matrixInOut.writeToFile(matrix, FILEPATH_2);
    }
}
