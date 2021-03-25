package lesson20;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MainHome {
    public static void main(String[] args) {

            FileCopyUtilsImp file = new FileCopyUtilsImp();
            String pathTheCopiedFile = "src/lesson20/1.JPG";
            String pathToCopiesFiles = "C:\\Users\\Денис\\Desktop\\Super\\ForCopies\\Copies";
            file.createDir(pathToCopiesFiles);
            if (!file.isEmpty(pathToCopiesFiles)) {   //Код удаляет все файлы из папки (надоело вручную удалять)
                file.deleteAllFiles(pathToCopiesFiles);
                System.out.println("Файлы удалены");
            }
            try {
                file.copy(pathTheCopiedFile, pathToCopiesFiles + "\\2.jpg");
            } catch (FileAlreadyExistsException e) {
                e.printStackTrace();
            } catch (FileCopyFailedException e) {
                e.printStackTrace();
            }
            try {
                file.copy(new File(pathTheCopiedFile), new File(pathToCopiesFiles + "\\3.jpg"));
            } catch (FileCopyFailedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file.copy1(new File(pathTheCopiedFile), new File(pathToCopiesFiles + "\\4.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (FileAlreadyExistsException e) {
                e.printStackTrace();
            } catch (FileCopyFailedException e) {
                e.printStackTrace();
            }
            try {
                file.copy2(new File(pathTheCopiedFile), new File(pathToCopiesFiles + "\\5.jpg"));
            } catch (FileCopyFailedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }



    }

}
