package lessons.lesson11;

public class Main2 {
    public static void main(String[] args) {
        ElephantImp elephant= new ElephantImp();
        ElephantImp elephant1= new ElephantImp();
        ElephantImp elephant2= new ElephantImp();

        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        ZooAnimal [] animals=new ZooAnimal[6];
        animals[0] = elephant;
        animals[1] = elephant1;
        animals[2] = elephant2;
        animals[3] = monkey;
        animals[4] = monkey1;
        animals[5] = monkey2;
        for (ZooAnimal current:animals) {
            current.voice();} // polymorphism
        }
    }

