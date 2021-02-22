package lessons.lesson9;

public class Test {
    /* 1. Поля класса (характеристики объекта, переменные), описывает состояние объекта
       2. Конструкторы класса
       3. Методы            */

    String mainName; // переменная - название
    String description; //переменная - описание
    String pathToImage; // переменная - путь к картинке
    Question[] questions = new Question[20];

    public void addQuestion(Question question){ // Question - type,  question - ссылка на объект
        for (int i=0; i< questions.length; i++){
            if (questions[i]==null){
                questions [i] = question;
                break;

            }


        }

    }








}
