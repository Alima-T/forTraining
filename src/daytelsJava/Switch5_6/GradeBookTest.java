package daytelsJava.Switch5_6;

public class GradeBookTest {
    public static void main(String[] args) {
        //create GradeBook object myGradeBook and pass course name to constructor

        GradeBookSwitch5 myGradeBook = new GradeBookSwitch5("\nCS101 Introduction to Java Programming");
        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.inputGrades(); // read grades from user
        myGradeBook.displayGradeReport(); // display report based on grades


    }
}
