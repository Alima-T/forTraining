package lesson20;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// src/lesson20/1.JPG
public class FileCopyUtilsImp implements FileCopyUtils {
    @Override
    public void copy(String from, String to) throws FileAlreadyExistsException, FileCopyFailedException {
        long startTime = System.currentTimeMillis();
        try {
            File file = new File(to);
            if (file.exists()) {
                throw new FileAlreadyExistsException("Данный файл уже существует");

            }
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));
            int c = 0;
            while (true) {
                c = bis.read(); // Читает байты когда они закончаться т.е копирование будет завершено вернет -1
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
        long endTime = System.currentTimeMillis();
        String res = "Метод copy отрабатывает за: " + (endTime - startTime) + " ms";
        writeRes(res + "\n");
        System.out.println(res);

    }

    public void copy(File from, File to) throws FileAlreadyExistsException, FileCopyFailedException, IOException {
        long startTime = System.currentTimeMillis();
        if (to.exists()) {
            throw new FileAlreadyExistsException("Данный файл уже существует");

        }
        InputStream is = null;
        OutputStream os = null;
        try {

            is = new FileInputStream(from);
            os = new FileOutputStream(to);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (Exception o) {
            o.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
        long endTime = System.currentTimeMillis();
        String res = "Метод copy(c File параметрами) отрабатывает за: " + (endTime - startTime) + " ms";
        writeRes(res + "\n");
        System.out.println(res);
    }

    public void copy1(File source, File dest) throws FileAlreadyExistsException, FileCopyFailedException, IOException {
        long startTime = System.currentTimeMillis();
        if (dest.exists()) {
            throw new FileAlreadyExistsException("Данный файл уже существует");

        }
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        sourceChannel = new FileInputStream(source).getChannel();
        destChannel = new FileOutputStream(dest).getChannel();
        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        sourceChannel.close();
        destChannel.close();
        long endTime = System.currentTimeMillis();
        String res = "Метод copy1 отрабатывает за: " + (endTime - startTime) + " ms";
        writeRes(res + "\n");
        System.out.println(res);

    }

    public void copy2(File from, File to) throws FileAlreadyExistsException, FileCopyFailedException, IOException {
        if (to.exists()) {
            throw new FileAlreadyExistsException("Данный файл уже существует");

        }
        long startTime = System.currentTimeMillis();
        Files.copy(from.toPath(), to.toPath());
        long endTime = System.currentTimeMillis();
        String res = "Метод copy2 отрабатывает за: " + (endTime - startTime) + " ms";
        writeRes(res + "\n");
        System.out.println(res);

    }

    public void createDir(String pathName) {
        File startDir = new File(pathName);
        if (!startDir.exists()) {
            startDir.mkdir();
        }
    }

    public boolean isEmpty(String pathName) {
        File startDir = new File(pathName);
        File[] contenst = startDir.listFiles();
        if (contenst.length == 0) {
            return true;
        } else return false;
    }

    public void deleteAllFiles(String path) {
        for (File myFile : new File(path).listFiles()) {
            if (myFile.isFile()) {
                myFile.delete();

            }
        }
    }

    private void writeRes(String text) {
        String filePath = "C:\\Users\\Денис\\Desktop\\Super\\ForCopies\\Results.txt";
        File f = new File(filePath);
        if (!f.exists()) {
            try (PrintWriter writer = new PrintWriter(filePath, "UTF-8")) {
                writer.println(text);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
