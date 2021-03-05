package Fedor.les02_26Conlsole.tests;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConsoleTXT1 {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of(args[0]), Charset.forName("cp1251")); // возвращает кодировку, которая указана в файле
        System.out.println(content);
    }
}

