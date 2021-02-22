package lessons.lesson9;

public class EnglishTest {
    public static void main(String[] args) {
        Test englishTest = new Test(); // englishTest, findYourSelf - объекты класса Test
        Test findYourSelf = new Test();

        englishTest.mainName = "Find your level"; // после точки переменные объекта
        englishTest.description = "Find your IT profession";

        System.out.println();

        Question question1= new Question();
        question1.guestion = " My grandmother started work … 1960";

        Question question2= new Question();
        question2.guestion = "She ... like football";

        Question question3= new Question();
        question3.guestion = " She likes living in Spain, …?";

        Question question4= new Question();
        question4.guestion = " ... three sisters.";

        englishTest.addQuestion(question1);
        englishTest.addQuestion(question2);
        englishTest.addQuestion(question3);
        englishTest.addQuestion(question4);
    }
}
