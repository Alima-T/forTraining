package lessons.lesson20;

import java.io.File;
import java.io.FileFilter;

public class main2 {
    public static void main(String[] args) {
        File startDir = new File("C:\\logs\\");
        if (!startDir.exists()) {
            startDir.mkdir();  // or createDir (и файл и папка все одними методами) //если хотим конкретно, то isFile or isDir
        }

        if (startDir.isDirectory()) {
            File[] innerFiles = startDir.listFiles();
            for (File f : innerFiles) {
                System.out.println(f.getAbsolutePath());
            }
            if (startDir.isDirectory()) {
                File[] innerFiles2 = startDir.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.isDirectory()) {
                            return true;
                        }
                        if ((pathname.getName().endsWith("jpeg")) || (pathname.getName().endsWith("jpg"))) ;
                        {
                            return true;
                        }
                        // return false;
                    }
                });
                for (File f : innerFiles) {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
