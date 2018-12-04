package org.nmu.sa15.kostenkov.lab5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Before;
import org.junit.Test;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatrixWriteReadTest {
    private final static int ROW = 2;
    private final static int COLUMN = 2;
    private final String FILEPATH = "src/main/resources/ftww.json";
    private static MatrixManager matrixManager = new MatrixManager();
    private static MatrixWriteRead matrixInOut = new MatrixWriteRead();
    public static Matrix matrix = new Matrix();

    @Test
    public void readFromFile() throws IOException {
        Matrix matrix = null;
        try (FileInputStream fis = new FileInputStream(FILEPATH);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            matrix = gson.fromJson(isr, Matrix.class);
        } catch (IOException er) {
            System.out.println("Cannot read from file!");
        }
        List<List<Integer>> listData = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        listData.add(list);
        assertEquals(matrix, listData);
    }
}