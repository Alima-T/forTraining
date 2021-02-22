package lessons.lesson11;

public class Monkey implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("Uuuu");

    }

    @Override
    public void jump() {
        System.out.println("Monkey jumps");

    }

    @Override
    public void run() {
        System.out.println("Monkey runs");

    }
}
