package lessons.lesson11.les11copy;

public class Animal {
    private int age;

    // private / protected - выбор программиста, стилистика программиста. Шаблон написания кода - Стилистика написания кода - паттерны, максимально удобноая стилистика

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice(){
        System.out.println("кричит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false; // instanceof - проверяет является ли о объектом класса Animal

        Animal animal = (Animal) o; //убираем final после переопределения программа проверяет все поля на идентичность и теперь возвращает true если все поля одинаковые (см. Dog)

        return getAge() == animal.getAge();
    }

    @Override
    public int hashCode() {
        return getAge();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}


