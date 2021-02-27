package Fedor.les02_26Colsole.tests;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConcoleTXT {


    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("register"), StandardCharsets.US_ASCII);
         System.out.println(content);
    }
}
