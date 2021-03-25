package lessonsHomeWorks.lesson20;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileCopyMethods {


    public static void fileCopeStream(File source, File destination) throws IOException {
        long timeStart = System.currentTimeMillis();
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }

        long timeSpent = System.currentTimeMillis() - timeStart;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
    }


    public static void fileCopyChannel(File source, File destination) throws IOException {
        long timeStart = System.currentTimeMillis();
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(destination).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
        long timeSpent = System.currentTimeMillis() - timeStart;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
    }

    public static void fileCopyFiles(File source, File destination) throws IOException {
        long timeStart = System.currentTimeMillis();
        Files.copy(source.toPath(), destination.toPath());
        long timeSpent = System.currentTimeMillis() - timeStart;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
    }

}








