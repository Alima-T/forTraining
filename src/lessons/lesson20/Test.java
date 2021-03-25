package lessons.lesson20;

import java.io.File;
import java.io.IOException;

import static lessonsHomeWorks.lesson20.FileCopyMethods.*;

public class Test {

    public static void main(String[] args) throws InterruptedException, IOException {
        File source = new File("resources/InputFile.txt");
        File destination = new File("resources/OutputFile.txt");

        // Stream
        long start = System.currentTimeMillis();
        // засекаем время до выполнения копирования
        fileCopeStream(source, destination);
        System.out.println("Время копирования файла с помощью потоков = " + (System.currentTimeMillis() - start));

        // java.nio.FileChannel
        destination = new File("resources/OutputFile1.txt");
        start = System.currentTimeMillis();
        fileCopyChannel(source, destination);
        System.out.println("Время копирования файла с помощью java.nio.FileChannel = " + (System.currentTimeMillis() - start));

        // класса Files
        destination = new File("resources/OutputFile3.txt");
        start = System.currentTimeMillis();
        fileCopyFiles(source, destination);
        System.out.println("Время копирования файла с помощью класса Files Java = " + (System.currentTimeMillis() - start));

    }
}

