package alishev.abstract41;

public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal(); // ошибка, 'Animal' is abstract; cannot be instantiated, не может создаваться объект( instance - экземпляр) от абстрактоного класса
        // не является сущностью, а является концепцией
        Cat cat = new Cat();  //Cat & Dog это конкретные неабстрактные классы, поэтому можно создавать их объекты
        Dog dog = new Dog();

        cat.makeSound();
        dog.makeSound();
        cat.eat();

    }
}
