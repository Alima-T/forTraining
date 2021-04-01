package lessons.lesson15Exceptions;

/**
 * //наследуемся от любого встроенного Exception из java, все методы уже включены от родителя
 * единственное, что рекомендуется, это сгенерировать toString и все конструкторы из родительского класса (у родителя есть поля класса)
 * можно создавать таким образом сколько угодно своих Exception
 * если нигде не ругается при вызове, значит Nonchecked, т.е. неконтролирется, не проверяется средой разработки
 */
public class UncurrentAgeExceptionNonchecked extends RuntimeException{


    public UncurrentAgeExceptionNonchecked() {
    }

    public UncurrentAgeExceptionNonchecked(String message) {
        super(message);
    }

    public UncurrentAgeExceptionNonchecked(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeExceptionNonchecked(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeExceptionNonchecked(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
