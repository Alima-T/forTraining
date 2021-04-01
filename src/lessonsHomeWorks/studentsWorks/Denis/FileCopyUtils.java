package lessonsHomeWorks.studentsWorks.Denis;

import lessons.lesson20.FileAlreadyExistsException;
import lessons.lesson20.FileCopyFailedException;

public interface FileCopyUtils {

        void copy(String from, String to)throws FileAlreadyExistsException, FileCopyFailedException;



}
