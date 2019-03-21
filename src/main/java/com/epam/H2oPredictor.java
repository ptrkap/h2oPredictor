package com.epam;

import hex.genmodel.*;
import java.io.IOException;

public class H2oPredictor {

    public static void main(String[] args) throws IOException {
        String classpath = System.getProperty("java.class.path");
        String path = classpath.split(";")[0];
        MojoReaderBackend mojoReaderBackend = MojoReaderBackendFactory.createReaderBackend(path);
        MojoModel mojoModel = ModelMojoReader.readFrom(mojoReaderBackend);
    }
}
