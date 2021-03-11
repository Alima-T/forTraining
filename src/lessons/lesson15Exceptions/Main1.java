package lessons.lesson15Exceptions;

public class Main1 {
    public static void main(String[] args) {
//        String text = null;
//        System.out.println((text.length()));
//        System.out.println(("djgohgithg"));

        Person person= new Person();
        try {
            person.setAge(-10);
        } catch (UncurrentAgeExceptionChecked e) {
            e.printStackTrace();
        }
        System.out.println("Age set successfully");
//        try{
//            person.setAge(-10);
//            System.out.println("Age set successfully");
//        }catch (IllegalArgumentException e) {
//            System.out.println("Wrong age"); // сообщение для пользователя, в чем именно ошибка и нужно исправить
//        }
//        System.out.println("Try again"); //сообщение о том, что программа отработала и продолжает работать, ждет корректного ввода от п ользователя
    }


}
