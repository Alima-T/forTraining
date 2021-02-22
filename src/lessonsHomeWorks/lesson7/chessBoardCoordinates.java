package homeWorks.lesson7;

public class chessBoardCoordinates {
    public static String chessBoardCoordinates (int a, int b) { // вбивала вручную, не нашла заложенного в Idea формата
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7 || b > 7))
            return null;
        else return (Character.toString(letters.charAt(a))+numbers.charAt(b));

    }


}



/*public static String chessBoardCoord(int a, int b) {
            String letters = "abcdefgh";
            String numbers = "87654321";
            if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
            else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));


/* charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b.
   Character.toString - метод, который переводит полученный символ в строку*/



