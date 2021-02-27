package daytelsJava.Switch5_6;

import java.util.Scanner;

public class GradeBookSwitch5 {

    private String courseName;
    int total;
    int gradeCounter; //счетчик оценок
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;


    // constructor initializes courseName;
    public GradeBookSwitch5(String name) { // declaration of the variable name in args
        courseName = name; // initializes courseName

    }

    public void setCourseName(String name) {
        courseName = name; // store the course name

    }

    //method to retrieve (receive, get, returne) the course name
    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("\nWelcome to the GradeBook for\n%s!\n\n", getCourseName());
    }

    // input arbitrary [ˈɑːbɪtrərɪ] random number of grades from user - ввод произвольного количества оценок от пользователя
    public void inputGrades() {
        Scanner input = new Scanner(System.in);
        int grade;
        System.out.printf("%s\n%s\n %s\n %s\n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        /*  С помощью метода hasNext() можно узнать, есть ли следующий элемент, и не достигнут ли конец коллекции.
        И если элементы еще имеются, то hasNext() вернет значение true. Метод hasNext() следует вызывать перед методом next(),
        так как при достижении конца коллекции метод next() выбрасывает исключение NoSuchElementException.
        И метод remove() удаляет текущий элемент, который был получен последним вызовом next().
        */
        // loop until user enters the end-of-file indicator - цикл до тех пор, пока пользователь не войдет в индикатор конца файла
        while (input.hasNext()) {
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1; // or ++gradeCounter;

            // call method to increment appropriate counter -вызов метода для увеличения соответствующего счетчика

            incrementLetterGradeCounter(grade);
        }
    }

    // add 1 to appropriate counter for specified grade
    public void incrementLetterGradeCounter(int grade) { //declaration of the variable numericGrade in args
        // determine which grade was entered
        switch (grade / 10) {
            case 90: // grade was between 90
            case 100://and 100
                ++aCount;
                break;// to exit switch
            case 80:// 80-89
                ++aCount;
                break;
            case 70:// 70-79
                ++aCount;
                break;
            case 60:// 60-69
                ++aCount;
                break;
            default:// less than 60
                ++aCount;
                break; // optional; will exit switch anyway

        }
    }
    // display a report based on the grades entered by the user - отображение отчета на основе оценок, введенных пользователем
    public void displayGradeReport(){
        System.out.println("\nGrade Report:");
        // if user entered at least one grade...
        if (gradeCounter!=0){
            double statisticAverage = (double)total/gradeCounter;
            // output summery of rezults
            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", statisticAverage);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n","Number of students who received each grade:",
                    "A: ", aCount, //display number of A grades
                    "B: ", bCount, // display number of B grades
                    "C: ", cCount, // display number of C grades
                    "D: ", dCount, // display number of D grades
                    "F: ", fCount ); // display number of F grades)

        }
        else System.out.println("No grades were entered");
    }

}
