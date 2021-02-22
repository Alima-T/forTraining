package lessons.lesson5;

public class trimMethod {
    public static void main(String[] args) {
        String text = "    I am a programmer    ";
        // char - converting a string to an array
        char[] charFromText = text.toCharArray();
        System.out.println(text.length());

        // trim - removes extra spaces at the beginning and end of a line - удаляет лишние пробелы в начале и в конце строки
        System.out.println((text.trim()));

        // concat(String s)- add string "!!!" to string "I am a programmer"
        // ==text = text + "!!!";   ==  text += "!!!";
        System.out.println (text.concat("!!!"));

        //toUpperCase /toLowerCase
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // replace - replace all occurrences (вхождения) of the 'old' character with 'new' (target with replacement
        System.out.println(text.replace('a','A'));
        System.out.println(text.replace("I am", "You are")); // replaces groups of characters
        //replaceFirst - replaces only first occurrence, next occurrences will be old


        // text =  text.replace('a', 'A'); // oldChar: 'a", newChar: 'A'
       /* text = text.replace("I am", "You are");
        System.out.println(text);
        */




    }
}
