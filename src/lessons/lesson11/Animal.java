package lessons.lesson11;

import java.util.Objects;

public class Animal {
    private int age;
    private String nickName;

    public Animal(int age) { //конструктор
        this.age = age;
    }
    public Animal() { // конструктор по умолчанию - создать обязательно
    }
    public Animal(int age, String nickName) { //конструктор с 2 параметрами
        this.age = age;
        this.nickName = nickName;
    }

    public int getAge() { // получение значения
        return age;
    }

    public void setAge(int age) { // установка значение  - на сохранениеп
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    @Override //аннотация к методу, никогда не стирать, может обернуться тем, что не отработает метод/проект
    public String toString() {
        return "Animal{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickName, animal.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickName);
    }
//
//
//    public void voice() {
//        System.out.println("Mau");
//    }
}

