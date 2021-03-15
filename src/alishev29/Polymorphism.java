package alishev29;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal(); // два раза не можем вызвать одну переменную, но по отделности можно.
   //   Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();
        //  animal.bark(); // animal не имеет доступа к методам дочернего класса dog, but dog class extended and has access to all the methods of the animal
        dog.eat();
        dog.bark();

        testPolymorphism(animal); //благодаря полиморфизму мы вызываем один метод testPolymorphism, принимающий на вход Animal animal, то мы можем вызвать его на объектах 3-х разных классов(1 додительский и 2 наслодованных))
        testPolymorphism(dog); // использовался метод, который находится в дочернем классе
        testPolymorphism(cat); // т.к. в дочернем классе нет собственных методов, то использовался метод родительского класса Animal
    }

    public static void testPolymorphism (Animal animal){
        animal.eat();
    }
}
