package Fedor.les02_03Classes;

public class Car {
    int gas = 1; // (0-100)
    String furniture = "Textile";

    static String serviceCenter = "https://service_center.ru";

    public Car() {
        this(15); // конструктор, почитать и переделать примеры https://javarush.ru/groups/posts/konstruktory-v-java-1
    }

    public Car(int i) {
        int g = this.gas;
        this.gas = i; // можем читать и устанавливать значения членов экземпляра класса через this
    }

    public static void doSomething(){
        // Ошибка - класс не является экземпляром
        // Object me = this;
    }

    public void doSomethingForTheCar(){
        Object me = this;

        int g = this.gas;
    }
}
