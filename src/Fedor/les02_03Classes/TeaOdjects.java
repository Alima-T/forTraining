package Fedor.les02_03Classes;

public class TeaOdjects {
    public static void main(String[] args) {
        final Tea teaInstance1 = new Tea(); // Tea - ссылочный тип с одинаковым с классом названием.
        // Создаем новые экземпляр класса Tea (а имеено new Tea),
        // затем присваиваем значение новой переменной teaInstance1 типа Tea новый экземпляр класса.
        teaInstance1.print(); // метод print создан в классе Tea, вывод на консоль переменных заданных из класса,
        // т.к. мы еще не изменили их в экземплярах.
        teaInstance1.setSort("Red");  // метод setSort создан в классе Tea. Изменение переменной в экземпляре
        teaInstance1.print();//Вывод на консоль уже с изменением в экземпляре
        final Tea teaInstance2 = new Tea(); //создаем новые экземпляр класса Tea (-- new Tea)
        teaInstance2.print();
        teaInstance2.setWeight(2); // метод setWeight создан в классе Tea. Изменение переменной в экземпляре
        teaInstance2.setSort("White");
        teaInstance2.print();
        teaInstance1.print();


    }

}