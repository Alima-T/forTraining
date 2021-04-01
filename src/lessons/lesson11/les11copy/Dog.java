package lessons.lesson11.les11copy;

public class Dog extends Animal {

    @Override
    public void voice() { // при выборе метода появляется public void voice() {...}, что значит, что метод будет переопределен, сверху появляется @Override - аннотация - не удалять
        System.out.println("гав"); // теперь животное не кричит, а гавкает
        // super.voice(); // переопределение метода - это изменение метода из родительского класса под свои нужды
        // перегрузка метода - это когда один или более методов с одинаковым названием, но с разными параметрами,
        // при выборе он перегружается в зависимости от того каие параметры внесены и выбирается тот метод, которому соответствуют внесеннные параметры)
    }

    @Override
    public String toString() {
        return "Dog: "+this.getAge() + " years";
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setAge(2);
        dog1.voice();
        dog2.setAge(2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Animal[] animals = new Animal[6];
        animals[0] = cat2;
        animals[1] = dog1;
        animals[2] = cat1;
        animals[3] = dog3;
        animals[4] = cat1;
        animals[5] = dog2;

        for(Animal animal: animals) //Тип текущий animal: массив, по которму мы хотим пройтись, здесь цикл пройдет по каждому
            animal.voice();// и у каждого вызовет метод voice (у каждого объекта свой) - полиморфизм, выполнение одной программы проявляется как разное в зависимости от типа объекта,
        // в классе которого она переопределена

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2);



        //Вывод на консоль c метода toString:
        //если не генерировать вообще:  lessons.les11copy.Dog@2 вообще (см. описание к методу toString {return getClass().getName() + "@" + Integer.toHexString(hashCode());})
        //если просто сгенерировать в родительский класс: Dog{}
        //если переопределить в классе дочернем, то видим:  Dog: 2 years

        //getClass
        // многопоточность - viber telegram и т.д. (wait-заснуть/notify- разбудить - идут в паре)


    }
}
