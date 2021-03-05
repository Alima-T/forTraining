package Fedor.les02_26Conlsole.tests;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ConsoleReestr {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Alina\\IdeaProjects\\ToyShop\\src\\main\\resources\\ProductRegister(Toys).txt");
        Charset encoding = StandardCharsets.UTF_8;
        try (Stream<String> lines = Files.lines(path, encoding))
        {
            lines.forEach(System.out::println);
        }
    }

}
