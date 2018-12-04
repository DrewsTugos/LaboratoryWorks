package org.nmu.sa15.kostenkov.lab5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author Kostenkov
 * @file ftww.json file to work with
 */
public class MatrixWriteRead {

    //ftww=file to work with
    //fos = file output stream
    //osr/isr=output/input stream reader
    public void writeToFile(Matrix matrix, String filePath) throws IOException {
        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter(filePath);
        gson.toJson(matrix, fileWriter);
        fileWriter.flush();
    }

    public void readFromFile(Matrix matrix,String filePath) throws IOException {
        matrix = null;
            FileReader fileReader = new FileReader(filePath);
            Gson gson = new Gson();
        matrix = gson.fromJson(fileReader, Matrix.class);
        fileReader.close();
    }
}
