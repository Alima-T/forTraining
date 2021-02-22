package Fedor.les02_03Classes;

public class Logics {
    public static void main(String[] args) {
        final Car carInstance1 = new Car();
        carInstance1.gas = 10;

        final Car carInstance2;
        carInstance2 = new Car();
        carInstance2.gas = 20;

        final Car carInstance3 = new Car();
        carInstance3.gas = 30;
        carInstance3.furniture = "Leather";

        Car.serviceCenter = "https://service_center.com";
        Car.doSomething();

        //допустимо, но нежелательно (вероятно, программист ошибся)
        carInstance1.serviceCenter = "https://service_center.com";
        carInstance1.doSomething();

        // Ошибка - переменная экземпляра недоступна для класса
        // Car.gas = 40;

        // Ошибка - метод экземпляра недоступен для класса
        // Car.doSomethingForTheCar();


        carInstance1.doSomethingForTheCar();
        carInstance3.doSomethingForTheCar();
    }
}
