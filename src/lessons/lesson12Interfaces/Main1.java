package lessons.lesson12Interfaces;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix=new Matrix(3,2);

        System.out.println(matrix.getRows()); // примитивный тип выводится без toString, который обязателен для ссылочных типов
        System.out.println(matrix.getColumns());
        matrix.setValueAt(0,0,2);
        matrix.setValueAt(0,1,1);

        matrix.setValueAt(0,2,1);
        matrix.setValueAt(1,0,3);

        matrix.setValueAt(1,1,5);
        matrix.setValueAt(1,2,6);

        System.out.println(matrix.getValueAt(0,0));



    }
}

