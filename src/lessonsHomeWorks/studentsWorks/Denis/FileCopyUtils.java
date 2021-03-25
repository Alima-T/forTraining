package lesson20;

public interface FileCopyUtils {

        void copy(String from, String to)throws  FileAlreadyExistsException, FileCopyFailedException;



}
