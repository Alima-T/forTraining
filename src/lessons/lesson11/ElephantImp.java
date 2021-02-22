package lessons.lesson11;

public class ElephantImp implements ZooAnimal {


    @Override
    public void voice() {
        System.out.println("Puffff");

    }

    @Override
    public void jump() {
        System.out.println("Elephant doesn't jump");

    }

    @Override
    public void run() {
        System.out.println("Elephant runs");

    }
}


