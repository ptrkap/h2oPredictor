package com.epam;

import hex.genmodel.*;
import java.io.IOException;
import java.util.Arrays;

public class H2oPredictor {

    public static void main(String[] args) throws IOException {
        String classpath = System.getProperty("java.class.path");
        String path = classpath.split(";")[0];
        MojoReaderBackend mojoReaderBackend = MojoReaderBackendFactory.createReaderBackend(path);
        MojoModel mojoModel = ModelMojoReader.readFrom(mojoReaderBackend);
        double[] row = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] preds = new double[10];
        double[] results = mojoModel.score0(row, preds);
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(preds));
        System.out.println(Arrays.toString(results));
    }
}
