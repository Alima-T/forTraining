package lessons.lesson11;

public class ExselStudent extends Student {// extend - мы взяли в родители класс Student

    @Override  // метод вызван из родительского класса, мы его переопределяем под свой класс.
    public int perimetrTriangle(int sideA, int sideB, int sideC) {
       if (sideA+sideB<sideC){ // отличник сначала проверяет корректность введенных данных
           System.out.println("Nonsense");
           return -1; // означает false - такой цифры не существует
       }
       return sideA+sideB+sideC;
    }
}
