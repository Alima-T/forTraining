package lessons.lesson15Exceptions;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /**
     * наследуемся от Exception, который контролируется (checked) и
     * будет требовать добавления в сигнатуру метода, в котором используется
     * строки "throw UncurrentAgeExceptionChecked" либо установить try-catch block,
     * но нам не нужно устанавливать try-catch block если мы выбрасываем информацию для другого класса, зачем нам ее там же перехватывать.
     * добавляем марку "throw UncurrentAgeExceptionChecked" в сигнатуру метода (это марка, "Осторожно, этот метод может выбросить throw exception)
     * теперь эта марка будет сигнализировать всем, кто будет этот метод использовать, что его нужно обработать, т.е. добавить try-catch block
     *
     * @param age
     */
    public void setAge(int age) throws UncurrentAgeExceptionChecked {
        if (age < 0 || age > 150) {
            throw new UncurrentAgeExceptionChecked("age<0||age>150");// IllegalArgumentException заменен на созданный нами класс UncurrentAgeExceptionChecked
        }
        this.age = age;
    }
//    /**
//     *  IllegalArgumentException меняем на созданный нами новый класс UncurrentAgeException, наследованный от RuntimeException, наследуемся от любого встроенного Exception из java, все методы уже включены от родителя
//     *  * единственное, что рекомендуется, это сгенерировать все конструкторы из родительского класса (у родителя есть поля класса)
//     *  * можно создавать таким образом сколько угодно своих Exception
//     * @param age
//     */
//    public void setAge(int age) {
//        if(age<0||age>150){
//            throw new UncurrentAgeException("age<0||age>150");// IllegalArgumentException заменен на созданный нами класс UncurrentAgeException - NONCHECKED - не контролируется(не проверяется java)
//        }
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
