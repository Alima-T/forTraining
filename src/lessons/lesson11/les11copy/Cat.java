package lessons.lesson11.les11copy;

public class Cat extends Animal {



    public void voice(){
        System.out.println("mau");
    }
    @Override
    public String toString() {
        return "Cat: "  + this.getAge() + "years";

    }
}


