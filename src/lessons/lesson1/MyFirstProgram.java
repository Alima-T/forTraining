package lessons.lesson1;

public class MyFirstProgram {
    public static void main(String[] args) {

        int widthTable = 2;
        int lenghtTable = 6;
        int widthRoom = 10;
        int lengthRoom = 5;

        int areTable = widthTable*lenghtTable;
        int areRoom = widthRoom*lengthRoom;

        int countOfTables = areRoom/areTable;

        int freeSpace = areRoom % areTable;

// sout - рабочая консоль для вывода текста на экран

        System.out.println("Количество столов, вмещающихся вкомнату " + countOfTables);
        System.out.println("Cвободного места остается " + freeSpace);




    }



}
