package lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        Animal animalElephant = new Animal(10,"Elephant");
       // animal.toString(); // Один из 9 стандартных методов клсасса Object, которые добавляются по умодчанию
        // при создании объекта (экземпляра) класса (здесь new Animal), преобразовывает наш объект в текстовый формат для печати на консоли или на странице сайта
        System.out.println(animalElephant.toString());
        System.out.println(animalElephant);
        Animal animalMonkey = new Animal(10, "Elephant");
        boolean equalsAnimal = animalMonkey.equals(animalElephant);
        System.out.println(equalsAnimal);


    }
}
