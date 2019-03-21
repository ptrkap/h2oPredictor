package com.epam;

import hex.genmodel.*;
import java.io.IOException;

public class H2oPredictor {

    private static final String PATH = System.getProperty("user.dir") + "\\src\\main\\resources";

    public static void main(String[] args) throws IOException {
        MojoReaderBackend mojoReaderBackend = MojoReaderBackendFactory.createReaderBackend(PATH);
        MojoModel mojoModel = ModelMojoReader.readFrom(mojoReaderBackend);
    }
}
