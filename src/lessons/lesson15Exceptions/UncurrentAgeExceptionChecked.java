package lessons.lesson15Exceptions;

/**
 * //наследуемся от любого встроенного Exception из java, который контролируется (checked) средой разработки, все методы уже включены от родителя
 *  * единственное, что рекомендуется, это сгенерировать toString и все конструкторы из родительского класса (у родителя есть поля класса)
 *  Exception из java, который контролируется (checked) и будет требовать добавления в сигнатуру метода, в котором используется
 * строки "throw UncurrentAgeExceptionChecked" либо установить try-catch block, но нам не нужно устанавливать try-catch block
 * если мы выбрасываем информацию для другого класса, зачем нам ее там же перехватывать.
 * добавляем марку "throw UncurrentAgeExceptionChecked" в сигнатуру метода (это марка, "Осторожно, этот метод может выбросить throw exception)
 * теперь эта марка будет сигнализировать всем, кто будет этот метод использовать, что его нужно обработать, т.е. добавить try-catch block
 * можно создавать таким образом сколько угодно своих Exception
 * */
public class UncurrentAgeExceptionChecked extends Exception{
    public UncurrentAgeExceptionChecked() {
    }

    public UncurrentAgeExceptionChecked(String message) {
        super(message);
    }

    public UncurrentAgeExceptionChecked(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeExceptionChecked(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeExceptionChecked(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "UncurrentAgeExceptionChecked{}";
    }
}
