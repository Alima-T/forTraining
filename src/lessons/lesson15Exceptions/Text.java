package lessons.lesson15Exceptions;

public class Text {
    public static void main(String[] args) {
        String text = "I am a programmer, am I or not?";
        String word = "am";
        boolean hasLetters = text.matches("(^.*[^A-zА-яЁё].*$\")");// [a-z][A-Z][а-я][А-Я]
//        if (!hasLetters) {
//            throw new NullPointerException("There are no words");
//        }else {
            String[] parts = text.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equals(word)) {
                    System.out.println(i);
                }
            }
        }}


